package com.winkelmann.swl.dc.project.bpm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winkelmann.swl.dc.framework.web.controller.BaseController;
import com.winkelmann.swl.dc.framework.web.page.TableDataInfo;
import com.winkelmann.swl.dc.project.bpm.domain.BPMApplicationHist;
import com.winkelmann.swl.dc.project.bpm.service.impl.BPMApplicationHistService;

@RestController
@RequestMapping("/bpm/applicationhist")
public class BPMApplicationHistController extends BaseController
{
	@Autowired
	BPMApplicationHistService applicationHistService;
	
	@GetMapping("/listbyappnbr")
	public TableDataInfo getApplicationByAppNbr(BPMApplicationHist hist)
	{
		startPage();
		List<BPMApplicationHist> list = applicationHistService.selectBPMApplicationHistByAppNbr(hist);
		return getDataTable(list);
	}
}
