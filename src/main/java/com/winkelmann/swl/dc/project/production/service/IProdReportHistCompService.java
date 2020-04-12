package com.winkelmann.swl.dc.project.production.service;

import java.util.List;

import com.winkelmann.swl.dc.project.production.domain.ProdReportHistComp;

public interface IProdReportHistCompService
{
	public List<ProdReportHistComp> selectProdReportHistCompList(ProdReportHistComp comp);
	public int insertProdReportHistComp(ProdReportHistComp comp);
	public int insertProdReportHistCompBatch(List<ProdReportHistComp> compList);
	public int updateProdReportHistComp(ProdReportHistComp comp);
	public int deleteProdReportHistCompById(Long id);
	public int deleteProdReportHistCompByReportId(Long reportId);
}
