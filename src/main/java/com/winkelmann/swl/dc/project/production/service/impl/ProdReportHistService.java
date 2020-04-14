package com.winkelmann.swl.dc.project.production.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.winkelmann.swl.dc.common.utils.SecurityUtils;
import com.winkelmann.swl.dc.project.production.domain.ProdReportHist;
import com.winkelmann.swl.dc.project.production.domain.ProdReportHistComp;
import com.winkelmann.swl.dc.project.production.mapper.ProdReportHistCompMapper;
import com.winkelmann.swl.dc.project.production.mapper.ProdReportHistMapper;
import com.winkelmann.swl.dc.project.production.service.IProdReportHistService;

/**
 * 生产报工管理 服务层
 * @author Administrator
 *
 */
@Service
public class ProdReportHistService implements IProdReportHistService
{
	@Autowired
	private ProdReportHistMapper prodReportHistMapper;
	@Autowired
	private ProdReportHistCompMapper prodReportHistCompMapper;

	// 查询生产报工数据
	@Override
	public List<ProdReportHist> selectProdReportHistList(ProdReportHist reportHist)
	{
		return prodReportHistMapper.selectProdReportHistList(reportHist);
	}

	// 根据Id查询生产报工记录
	@Override
	public ProdReportHist selectProdReportHistById(Long id)
	{
		return prodReportHistMapper.selectProdReportHistById(id);
	}

	// 新增生产报工
	@Override
	@Transactional
	public int insertProdReportHist(ProdReportHist reportHist)
	{
		int rows = prodReportHistMapper.insertProdReportHist(reportHist);
		
		if (reportHist.getComponents().size() > 0)
		{
			// 设置零件List reportId
			for (ProdReportHistComp c : reportHist.getComponents())
			{
				c.setReportId(reportHist.getId());
				c.setCreateBy(SecurityUtils.getUserName());
			}
			prodReportHistCompMapper.insertProdReportHistCompBatch(reportHist.getComponents());
		}
		
		return rows;
	}

	// 修改生产报工
	@Override
	@Transactional
	public int updateProdReportHist(ProdReportHist reportHist)
	{
		int rows = prodReportHistMapper.updateProdReportHist(reportHist);
		
		// 删除原有零件列表
		prodReportHistCompMapper.deleteProdReportHistCompByReportId(reportHist.getId());
		
		// 更新零件列表 TODO: 校验原先有零件列表，修改时全部移除的情况
		if (reportHist.getComponents().size() > 0)
		{
			// 更新修改后的零件列表reportId和createBy
			for (ProdReportHistComp c : reportHist.getComponents())
			{
				c.setReportId(reportHist.getId());
				c.setCreateBy(SecurityUtils.getUserName());
			}
			// 插入修改后的零件列表
			prodReportHistCompMapper.insertProdReportHistCompBatch(reportHist.getComponents());
		}
		
		return rows;
	}

	// 通过Id删除生产报工
	@Override
	@Transactional
	public int deleteProdReportHistById(Long id)
	{
		// 删除零件列表
		prodReportHistCompMapper.deleteProdReportHistCompByReportId(id);
		// 删除报工记录
		return prodReportHistMapper.deleteProdReportHistById(id);
	}
}
