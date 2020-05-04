package com.winkelmann.swl.dc.project.purchase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winkelmann.swl.dc.project.purchase.domain.PurPurchaseOrderHeader;
import com.winkelmann.swl.dc.project.purchase.mapper.PurPurchaseOrderHeaderMapper;
import com.winkelmann.swl.dc.project.purchase.service.IPurPurchaseOrderService;

@Service
public class PurPurchaseOrderService implements IPurPurchaseOrderService
{
	@Autowired
	PurPurchaseOrderHeaderMapper orderHeaderMapper;

	@Override
	public List<PurPurchaseOrderHeader> selectPurchaseOrderList(PurPurchaseOrderHeader purchaseOrderHeader)
	{
		return orderHeaderMapper.selectPurchaseOrderList(purchaseOrderHeader);
	}

	@Override
	public PurPurchaseOrderHeader selectPurchaseOrderById(Long id)
	{
		return orderHeaderMapper.selectPurchaseOrderById(id);
	}
	
}
