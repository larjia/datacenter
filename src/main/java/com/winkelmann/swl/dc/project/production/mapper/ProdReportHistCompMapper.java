package com.winkelmann.swl.dc.project.production.mapper;

import java.util.List;

import com.winkelmann.swl.dc.project.production.domain.ProdReportHistComp;

public interface ProdReportHistCompMapper
{
	public List<ProdReportHistComp> selectProdReportHistCompList(ProdReportHistComp comp);
	public int insertProdReportHistComp(ProdReportHistComp comp);
	public int insertProdReportHistCompBatch(List<ProdReportHistComp> compList);
	public int updateProdReportHistComp(ProdReportHistComp comp);
	public int deleteProdReportHistCompById(Long id);
	public int deleteProdReportHistCompByReportId(Long reportId);
}
