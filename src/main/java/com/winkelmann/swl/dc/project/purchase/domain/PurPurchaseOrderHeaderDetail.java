package com.winkelmann.swl.dc.project.purchase.domain;

public class PurPurchaseOrderHeaderDetail
{
	// 采购订单Id
	private Long purchaseOrderId;
	// 采购订单详细Id
	private Long purchaseOrderDetailId;
	
	public Long getPurchaseOrderId()
	{
		return purchaseOrderId;
	}
	
	public void setPurchaseOrderId(Long purchaseOrderId)
	{
		this.purchaseOrderId = purchaseOrderId;
	}
	
	public Long getPurchaseOrderDetailId()
	{
		return purchaseOrderDetailId;
	}
	
	public void setPurchaseOrderDetailId(Long purchaseOrderDetailId)
	{
		this.purchaseOrderDetailId = purchaseOrderDetailId;
	}

}
