package com.winkelmann.swl.dc.project.purchase.domain;

import java.sql.Date;
import java.util.List;

import com.winkelmann.swl.dc.framework.web.domain.BaseEntity;


public class PurPurchaseOrderHeader extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	// 订单号
	private String orderNbr;
	// 供应商代码
	private String supplier;
	// 供应商名称
	private String supplierName;
	// 发送至
	private String shipTo;
	// 订单日期
	private Date orderDate;
	// 货币
	private String currency;
	// 支付方式
	private String crTerm;
	// 订单详细对象集合
	private List<PurPurchaseOrderDetail> orderDetails;
	
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getOrderNbr()
	{
		return orderNbr;
	}
	public void setOrderNbr(String orderNbr)
	{
		this.orderNbr = orderNbr;
	}
	public String getSupplier()
	{
		return supplier;
	}
	public void setSupplier(String supplier)
	{
		this.supplier = supplier;
	}
	public String getSupplierName()
	{
		return supplierName;
	}
	public void setSupplierName(String supplierName)
	{
		this.supplierName = supplierName;
	}
	public String getShipTo()
	{
		return shipTo;
	}
	public void setShipTo(String shipTo)
	{
		this.shipTo = shipTo;
	}
	public Date getOrderDate()
	{
		return orderDate;
	}
	public void setOrderDate(Date orderDate)
	{
		this.orderDate = orderDate;
	}
	public String getCurrency()
	{
		return currency;
	}
	public void setCurrency(String currency)
	{
		this.currency = currency;
	}
	public String getCrTerm()
	{
		return crTerm;
	}
	public void setCrTerm(String crTerm)
	{
		this.crTerm = crTerm;
	}
	public List<PurPurchaseOrderDetail> getOrderDetails()
	{
		return orderDetails;
	}
	public void setOrderDetails(List<PurPurchaseOrderDetail> orderDetails)
	{
		this.orderDetails = orderDetails;
	}
	
}
