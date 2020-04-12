package com.winkelmann.swl.dc.project.production.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winkelmann.swl.dc.project.production.domain.ProdReportHistComp;
import com.winkelmann.swl.dc.project.production.mapper.ProdReportHistCompMapper;
import com.winkelmann.swl.dc.project.production.service.IProdReportHistCompService;

@Service
public class ProdReportHistCompService implements IProdReportHistCompService
{
	@Autowired
	private ProdReportHistCompMapper compMapper;

	@Override
	public List<ProdReportHistComp> selectProdReportHistCompList(ProdReportHistComp comp)
	{
		return compMapper.selectProdReportHistCompList(comp);
	}

	@Override
	public int insertProdReportHistComp(ProdReportHistComp comp)
	{
		return compMapper.insertProdReportHistComp(comp);
	}

	@Override
	public int insertProdReportHistCompBatch(List<ProdReportHistComp> compList)
	{
		return compMapper.insertProdReportHistCompBatch(compList);
	}

	@Override
	public int updateProdReportHistComp(ProdReportHistComp comp)
	{
		return compMapper.updateProdReportHistComp(comp);
	}

	@Override
	public int deleteProdReportHistCompById(Long id)
	{
		return compMapper.deleteProdReportHistCompById(id);
	}

	@Override
	public int deleteProdReportHistCompByReportId(Long reportId)
	{
		return compMapper.deleteProdReportHistCompByReportId(reportId);
	}

}
