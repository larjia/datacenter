package com.winkelmann.swl.dc.project.masterdata.domain;

import java.util.List;

import com.winkelmann.swl.dc.framework.web.domain.BaseEntity;

public class Warehouse extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String number;				// 编码
	private String description;			// 描述
	private String defaultStatus;   	// 默认库存状态
	private String disabled; 			// 0正常1停用
	private List<Location> locations; 	// 库位集合
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getDefaultStatus()
	{
		return defaultStatus;
	}
	
	public void setDefaultStatus(String defaultStatus)
	{
		this.defaultStatus = defaultStatus;
	}
	
	public String getDisabled()
	{
		return disabled;
	}

	public void setDisabled(String disabled)
	{
		this.disabled = disabled;
	}

	public List<Location> getLocations()
	{
		return locations;
	}

	public void setLocations(List<Location> locations)
	{
		this.locations = locations;
	}

}
