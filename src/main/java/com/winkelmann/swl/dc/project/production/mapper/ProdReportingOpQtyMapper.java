package com.winkelmann.swl.dc.project.production.mapper;

import java.util.List;

import com.winkelmann.swl.dc.project.production.domain.ProdReportingOpQty;

public interface ProdReportingOpQtyMapper
{
	public List<ProdReportingOpQty> selectReportingOpQty(ProdReportingOpQty reportingOpQty);
}
