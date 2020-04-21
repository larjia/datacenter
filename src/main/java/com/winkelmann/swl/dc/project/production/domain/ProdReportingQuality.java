package com.winkelmann.swl.dc.project.production.domain;

import java.sql.Date;

import com.winkelmann.swl.dc.framework.aspectj.lang.annotation.Excel;
import com.winkelmann.swl.dc.framework.web.domain.BaseEntity;

public class ProdReportingQuality extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@Excel(name = "生产日期", dateFormat = "yyyy-MM-dd")
	private Date prodDate;
	
	@Excel(name = "产品名称")
	private String partProjName;
	
	@Excel(name = "物料号")
	private String partNumber;
	
	@Excel(name = "FTQ")
	private Double ftq = 0d;
	
	@Excel(name = "泄漏率")
	private Double leakRate = 0d;
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public Date getProdDate()
	{
		return prodDate;
	}
	
	public void setProdDate(Date prodDate)
	{
		this.prodDate = prodDate;
	}
	
	public String getPartProjName()
	{
		return partProjName;
	}
	
	public void setPartProjName(String partProjName)
	{
		this.partProjName = partProjName;
	}
	
	public String getPartNumber()
	{
		return partNumber;
	}
	
	public void setPartNumber(String partNumber)
	{
		this.partNumber = partNumber;
	}
	
	public Double getFtq()
	{
		return ftq;
	}
	
	public void setFtq(Double ftq)
	{
		this.ftq = ftq;
	}
	
	public Double getLeakRate()
	{
		return leakRate;
	}
	
	public void setLeakRate(Double leakRate)
	{
		this.leakRate = leakRate;
	}
	
}
