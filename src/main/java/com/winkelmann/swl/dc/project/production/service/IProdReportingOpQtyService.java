package com.winkelmann.swl.dc.project.production.service;

import java.util.List;

import com.winkelmann.swl.dc.project.production.domain.ProdReportingOpQty;

public interface IProdReportingOpQtyService
{
	public List<ProdReportingOpQty> selectReportingOpQty(ProdReportingOpQty rptOpQty);
}
