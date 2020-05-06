package com.winkelmann.swl.dc.project.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winkelmann.swl.dc.framework.web.controller.BaseController;
import com.winkelmann.swl.dc.framework.web.domain.AjaxResult;
import com.winkelmann.swl.dc.framework.web.page.TableDataInfo;
import com.winkelmann.swl.dc.project.purchase.domain.PurPurchaseOrderHeader;
import com.winkelmann.swl.dc.project.purchase.service.IPurPurchaseOrderService;

@RestController
@RequestMapping("/purchase/order")
public class PurPurchaseOrderController extends BaseController
{
	@Autowired
	private IPurPurchaseOrderService purchaseOrderService;
	
	@GetMapping("/list")
	public TableDataInfo list(PurPurchaseOrderHeader purchaseOrderHeader)
	{
		startPage();
		List<PurPurchaseOrderHeader> list = purchaseOrderService.selectPurchaseOrderList(purchaseOrderHeader);
		TableDataInfo res = getDataTable(list);
		return res;
	}
	
	@GetMapping("/{id}")
	public AjaxResult getInfoById(@PathVariable Long id)
	{
		return AjaxResult.success(purchaseOrderService.selectPurchaseOrderById(id));
	}
}
