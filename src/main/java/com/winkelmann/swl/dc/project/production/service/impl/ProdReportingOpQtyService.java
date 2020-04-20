package com.winkelmann.swl.dc.project.production.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winkelmann.swl.dc.project.production.domain.ProdReportingOpQty;
import com.winkelmann.swl.dc.project.production.mapper.ProdReportingOpQtyMapper;
import com.winkelmann.swl.dc.project.production.service.IProdReportingOpQtyService;

@Service
public class ProdReportingOpQtyService implements IProdReportingOpQtyService
{

	@Autowired
	private ProdReportingOpQtyMapper rptOpQtyMapper;
	
	@Override
	public List<ProdReportingOpQty> selectReportingOpQty(ProdReportingOpQty rptOpQty)
	{
		return rptOpQtyMapper.selectReportingOpQty(rptOpQty);
	}

}
