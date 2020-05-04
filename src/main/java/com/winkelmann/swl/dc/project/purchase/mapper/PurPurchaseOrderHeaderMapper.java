package com.winkelmann.swl.dc.project.purchase.mapper;

import java.util.List;

import com.winkelmann.swl.dc.project.purchase.domain.PurPurchaseOrderHeader;

public interface PurPurchaseOrderHeaderMapper
{
	// 查询所有采购订单数据
	public List<PurPurchaseOrderHeader> selectPurchaseOrderList(PurPurchaseOrderHeader purchaseOrderHeader);
	// 根据Id查询采购订单详细
	public PurPurchaseOrderHeader selectPurchaseOrderById(Long id);
}
