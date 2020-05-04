package com.winkelmann.swl.dc.project.purchase.service;

import java.util.List;

import com.winkelmann.swl.dc.project.purchase.domain.PurPurchaseOrderHeader;

public interface IPurPurchaseOrderService
{
	// 查询采购订单数据
	public List<PurPurchaseOrderHeader> selectPurchaseOrderList(PurPurchaseOrderHeader purchaseOrderHeader);
	// 根据Id查询采购订单详细
	public PurPurchaseOrderHeader selectPurchaseOrderById(Long id);
}
