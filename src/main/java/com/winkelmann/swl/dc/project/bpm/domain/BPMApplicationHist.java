package com.winkelmann.swl.dc.project.bpm.domain;

import java.sql.Date;

import com.winkelmann.swl.dc.framework.web.domain.BaseEntity;

public class BPMApplicationHist extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	// 流程名称
	private String processName;
	// 实例号
	private Long incident;
	// 申请人
	private String applicant;
	// 申请时间
	private Date appDate;
	// 成本中心
	private String cc;
	// 账户
	private String account;
	// 项目
	private String project;
	// 备注
	private String remark;
	// 行
	private Integer line;
	// 申请号
	private String appNbr;
	// 货币
	private String currency;
	// 供应商
	private String supplier;
	// 物料号
	private String part;
	// 描述1
	private String desc;
	// 描述2
	private String desc2;
	// UM
	private String UM;
	// 单位成本
	private Double purCost;
	// 数量
	private Double qty;
	
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getProcessName()
	{
		return processName;
	}
	public void setProcessName(String processName)
	{
		this.processName = processName;
	}
	public Long getIncident()
	{
		return incident;
	}
	public void setIncident(Long incident)
	{
		this.incident = incident;
	}
	public String getApplicant()
	{
		return applicant;
	}
	public void setApplicant(String applicant)
	{
		this.applicant = applicant;
	}
	public Date getAppDate()
	{
		return appDate;
	}
	public void setAppDate(Date appDate)
	{
		this.appDate = appDate;
	}
	public String getCc()
	{
		return cc;
	}
	public void setCc(String cc)
	{
		this.cc = cc;
	}
	public String getAccount()
	{
		return account;
	}
	public void setAccount(String account)
	{
		this.account = account;
	}
	public String getProject()
	{
		return project;
	}
	public void setProject(String project)
	{
		this.project = project;
	}
	public String getRemark()
	{
		return remark;
	}
	public void setRemark(String remark)
	{
		this.remark = remark;
	}
	public Integer getLine()
	{
		return line;
	}
	public void setLine(Integer line)
	{
		this.line = line;
	}
	public String getAppNbr()
	{
		return appNbr;
	}
	public void setAppNbr(String appNbr)
	{
		this.appNbr = appNbr;
	}
	public String getCurrency()
	{
		return currency;
	}
	public void setCurrency(String currency)
	{
		this.currency = currency;
	}
	public String getSupplier()
	{
		return supplier;
	}
	public void setSupplier(String supplier)
	{
		this.supplier = supplier;
	}
	public String getPart()
	{
		return part;
	}
	public void setPart(String part)
	{
		this.part = part;
	}
	public String getDesc()
	{
		return desc;
	}
	public void setDesc(String desc)
	{
		this.desc = desc;
	}
	public String getDesc2()
	{
		return desc2;
	}
	public void setDesc2(String desc2)
	{
		this.desc2 = desc2;
	}
	public String getUM()
	{
		return UM;
	}
	public void setUM(String uM)
	{
		UM = uM;
	}
	public Double getPurCost()
	{
		return purCost;
	}
	public void setPurCost(Double purCost)
	{
		this.purCost = purCost;
	}
	public Double getQty()
	{
		return qty;
	}
	public void setQty(Double qty)
	{
		this.qty = qty;
	}
	
}
