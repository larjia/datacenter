package com.winkelmann.swl.dc.project.bpm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winkelmann.swl.dc.project.bpm.domain.BPMApplicationHist;
import com.winkelmann.swl.dc.project.bpm.mapper.BPMApplicationHistMapper;
import com.winkelmann.swl.dc.project.bpm.service.IBPMApplicationHistService;

@Service
public class BPMApplicationHistService implements IBPMApplicationHistService
{
	@Autowired
	BPMApplicationHistMapper applicationHistMapper;

	@Override
	public List<BPMApplicationHist> selectBPMApplicationHistList(BPMApplicationHist hist)
	{
		return applicationHistMapper.selectBPMApplicationHistList(hist);
	}
	
}
