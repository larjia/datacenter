package com.winkelmann.swl.dc.project.purchase.domain;

import com.winkelmann.swl.dc.framework.web.domain.BaseEntity;

public class PurPurchaseOrderDetail extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	// 订单Id
	private Long orderId;
	// 行
	private Integer line;
	// 地点
	private String site;
	// 申请号
	private String appNbr;
	// 物料号
	private String part;
	// 已订购量
	private Double qtyOrder;
	// UM
	private String UM;
	// 采购成本
	private Double purCost;
	// 应纳税
	private String taxable; // 应纳税 0不纳税1纳税
	// 含税
	private String taxIn;   // 含税 0不含税1含税
	// 税率
	private Double taxRate; // 税率
	// 采购账户
	private String purAccount;
	// 成本中心
	private String cc;
	// 项目
	private String project;
	// 类型
	private String type;
	// 订单对象
	private PurPurchaseOrderHeader order;
	

	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public Long getOrderId()
	{
		return orderId;
	}
	public void setOrderId(Long orderId)
	{
		this.orderId = orderId;
	}
	public Integer getLine()
	{
		return line;
	}
	public void setLine(Integer line)
	{
		this.line = line;
	}
	public String getSite()
	{
		return site;
	}
	public void setSite(String site)
	{
		this.site = site;
	}
	public String getAppNbr()
	{
		return appNbr;
	}
	public void setAppNbr(String appNbr)
	{
		this.appNbr = appNbr;
	}
	public String getPart()
	{
		return part;
	}
	public void setPart(String part)
	{
		this.part = part;
	}
	public Double getQtyOrder()
	{
		return qtyOrder;
	}
	public void setQtyOrder(Double qtyOrder)
	{
		this.qtyOrder = qtyOrder;
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
	public String getTaxable()
	{
		return taxable;
	}
	public void setTaxable(String taxable)
	{
		this.taxable = taxable;
	}
	public String getTaxIn()
	{
		return taxIn;
	}
	public void setTaxIn(String taxIn)
	{
		this.taxIn = taxIn;
	}
	public Double getTaxRate()
	{
		return taxRate;
	}
	public void setTaxRate(Double taxRate)
	{
		this.taxRate = taxRate;
	}
	public String getPurAccount()
	{
		return purAccount;
	}
	public void setPurAccount(String purAccount)
	{
		this.purAccount = purAccount;
	}
	public String getCc()
	{
		return cc;
	}
	public void setCc(String cc)
	{
		this.cc = cc;
	}
	public String getProject()
	{
		return project;
	}
	public void setProject(String project)
	{
		this.project = project;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public PurPurchaseOrderHeader getOrder()
	{
		return order;
	}
	public void setOrder(PurPurchaseOrderHeader order)
	{
		this.order = order;
	}
	
}
