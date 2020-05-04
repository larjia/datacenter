package com.winkelmann.swl.dc.project.bpm.mapper;

import java.util.List;

import com.winkelmann.swl.dc.project.bpm.domain.BPMApplicationHist;

public interface BPMApplicationHistMapper
{
	// 查询所有BPM采购申请
	public List<BPMApplicationHist> selectBPMApplicationHistList(BPMApplicationHist hist);
}
