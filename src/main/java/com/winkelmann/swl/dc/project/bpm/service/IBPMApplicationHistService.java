package com.winkelmann.swl.dc.project.bpm.service;

import java.util.List;

import com.winkelmann.swl.dc.project.bpm.domain.BPMApplicationHist;

public interface IBPMApplicationHistService
{
	// 查询所有采购类BPM申请
	public List<BPMApplicationHist> selectBPMApplicationHistList(BPMApplicationHist hist);
	// 根据申请号查询所有采购类BPM申请
	public List<BPMApplicationHist> selectBPMApplicationHistByAppNbr(BPMApplicationHist hist);
}
