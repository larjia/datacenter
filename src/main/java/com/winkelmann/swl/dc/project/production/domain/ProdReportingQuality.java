package com.winkelmann.swl.dc.project.production.domain;

import java.sql.Date;

import com.winkelmann.swl.dc.framework.web.domain.BaseEntity;

public class ProdReportingQuality extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Date prodDate;
	private String partProjName;
	private String partNumber;
	private Double ftq = 0d;
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
