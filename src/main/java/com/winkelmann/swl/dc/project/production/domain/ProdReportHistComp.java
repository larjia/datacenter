package com.winkelmann.swl.dc.project.production.domain;

import com.winkelmann.swl.dc.framework.web.domain.BaseEntity;

public class ProdReportHistComp extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	// Id
	private Long id;
	// 零件名称
	private String component;
	// 批序号
	private String serialNumber;
	// 报工Id
	private Long reportId;
	// 报工对象
	private ProdReportHist report;
	
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getComponent()
	{
		return component;
	}
	
	public void setComponent(String component)
	{
		this.component = component;
	}
	
	public String getSerialNumber()
	{
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber = serialNumber;
	}
	
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	public Long getReportId()
	{
		return reportId;
	}

	public void setReportId(Long reportId)
	{
		this.reportId = reportId;
	}

	public ProdReportHist getReport()
	{
		return report;
	}

	public void setReport(ProdReportHist report)
	{
		this.report = report;
	}
	
}
