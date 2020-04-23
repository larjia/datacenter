package com.winkelmann.swl.dc.project.production.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winkelmann.swl.dc.common.utils.poi.ExcelUtil;
import com.winkelmann.swl.dc.framework.aspectj.lang.annotation.Log;
import com.winkelmann.swl.dc.framework.aspectj.lang.enums.BusinessType;
import com.winkelmann.swl.dc.framework.web.controller.BaseController;
import com.winkelmann.swl.dc.framework.web.domain.AjaxResult;
import com.winkelmann.swl.dc.framework.web.page.TableDataInfo;
import com.winkelmann.swl.dc.project.production.domain.ProdReportingOpQty;
import com.winkelmann.swl.dc.project.production.domain.ProdReportingQuality;
import com.winkelmann.swl.dc.project.production.service.IProdReportingOpQtyService;

@RestController
@RequestMapping("/production/reporting/quality")
public class ProdReportingQualityController extends BaseController
{
	@Autowired IProdReportingOpQtyService rptOpQtyService;
	
	/* FTQ & 泄漏率 报表 */
	@GetMapping("/ftqleak")
	public TableDataInfo ftqleak(ProdReportingQuality rpt)
	{
		startPage();
		List<ProdReportingQuality> res = getReporting(rpt);
		return getDataTable(res);
	}
	
	/* FTQ 报表 */
	@GetMapping("/ftq")
	public TableDataInfo ftq(ProdReportingQuality rpt)
	{
		ProdReportingOpQty ftq = new ProdReportingOpQty();
		ftq.setBeginTime(rpt.getBeginTime());
		ftq.setEndTime(rpt.getEndTime());
		ftq.setPartProjName(rpt.getPartProjName());
		ftq.setOp("综检");
		List<ProdReportingOpQty> ftqList = rptOpQtyService.selectReportingOpQty(ftq);
		
		return getDataTable(ftqList);
	}
	
	/* Leak 报表 */
	@GetMapping("/leak")
	public TableDataInfo leak(ProdReportingQuality rpt)
	{
		ProdReportingOpQty leak = new ProdReportingOpQty();
		leak.setBeginTime(rpt.getBeginTime());
		leak.setEndTime(rpt.getEndTime());
		leak.setPartProjName(rpt.getPartProjName());
		leak.setOp("氦检贴标签");
		List<ProdReportingOpQty> leakList = rptOpQtyService.selectReportingOpQty(leak);
		
		return getDataTable(leakList);
	}
	
	/**
	 * 导出Excel
	 */
	@Log(title = "生产报表", businessType = BusinessType.EXPORT)
	@GetMapping("/export")
	public AjaxResult export(ProdReportingQuality rpt)
	{
		List<ProdReportingQuality> res = getReporting(rpt);
		ExcelUtil<ProdReportingQuality> util = new ExcelUtil<ProdReportingQuality>(ProdReportingQuality.class);
		return util.exportExcel(res, "FTQ泄漏率报表");
	}
	
	private List<ProdReportingQuality> getReporting(ProdReportingQuality rpt)
	{
		// FTQ
		ProdReportingOpQty ftq = new ProdReportingOpQty();
		ftq.setBeginTime(rpt.getBeginTime());
		ftq.setEndTime(rpt.getEndTime());
		ftq.setPartProjName(rpt.getPartProjName());
		ftq.setOp("综检");
		List<ProdReportingOpQty> ftqList = rptOpQtyService.selectReportingOpQty(ftq);
		
		// Leak Rate
		ProdReportingOpQty leak = new ProdReportingOpQty();
		leak.setBeginTime(rpt.getBeginTime());
		leak.setEndTime(rpt.getEndTime());
		leak.setPartProjName(rpt.getPartProjName());
		leak.setOp("氦检贴标签");
		List<ProdReportingOpQty> leakList = rptOpQtyService.selectReportingOpQty(leak);
		
		List<ProdReportingQuality> res = new ArrayList<ProdReportingQuality>();
		
		for (ProdReportingOpQty f : ftqList)
		{
			ProdReportingQuality r = new ProdReportingQuality();
			r.setProdDate(f.getProdDate());
			r.setPartNumber(f.getPartNumber());
			r.setPartProjName(f.getPartProjName());
			
			if (f.getQtyCompleted() == 0)
			{
				r.setFtq(0.0);
			}
			else
			{
				Double d = (double) Math.round((1.0 - f.getQtyRejected() / f.getQtyCompleted()) * 10000 ) / 10000;
				r.setFtq(d);
	//						r.setFtq(new BigDecimal("1").subtract(f.getQtyRejected().divide(f.getQtyCompleted(), 4)));
			}
			
			res.add(r);
		}
		
		for (ProdReportingOpQty f2 : leakList)
		{
			Boolean flag = false;
			for (ProdReportingQuality rq : res)
			{
				if (f2.getProdDate().equals(rq.getProdDate()) && f2.getPartNumber().equals(rq.getPartNumber()))
				{
					flag = true;
					if (f2.getQtyCompleted() == 0)
					{
						rq.setLeakRate(0.0);
					}
					else
					{
						Double d = (double) Math.round((f2.getQtyRejected() / f2.getQtyCompleted()) * 10000) / 10000;
						rq.setLeakRate(d);
					}
				}
			}
			
			if (!flag)
			{
				ProdReportingQuality rq2 = new ProdReportingQuality();
				if (f2.getQtyCompleted() == 0)
				{
					rq2.setLeakRate(0.0);
				}
				else
				{
					Double d2 = (double) Math.round((f2.getQtyRejected() / f2.getQtyCompleted()) * 10000) / 10000;
					rq2.setLeakRate(d2);
				}
				
				rq2.setProdDate(f2.getProdDate());
				rq2.setPartProjName(f2.getPartProjName());
				rq2.setPartNumber(f2.getPartNumber());
				res.add(rq2);
			}
		}
		
		return res;
	}
}
