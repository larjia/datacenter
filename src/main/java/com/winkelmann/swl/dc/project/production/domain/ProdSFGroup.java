package com.winkelmann.swl.dc.project.production.domain;

import java.util.List;

import com.winkelmann.swl.dc.framework.web.domain.BaseEntity;
import com.winkelmann.swl.dc.project.system.domain.SysDept;

/*
 * 生产车间班组 比如钎焊班 检验班 包装入库班
 */
public class ProdSFGroup extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	// 班组Id
	private Long id;
	// 班组名称
	private String name;
	// 部门Id
	private Long deptId;
	// 是否需要零件 报工时判断该班组是否需要输入零件0不需要1需要
	private String needComp;
	// 部门对象
	private SysDept dept;
	// 工序List对象
	private List<ProdSFOperation> ops;
	
	public ProdSFGroup()
	{
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Long getDeptId()
	{
		return deptId;
	}

	public void setDeptId(Long deptId)
	{
		this.deptId = deptId;
	}

	public SysDept getDept()
	{
		return dept;
	}

	public void setDept(SysDept dept)
	{
		this.dept = dept;
	}

	public List<ProdSFOperation> getOps() {
		return ops;
	}

	public void setOps(List<ProdSFOperation> ops) {
		this.ops = ops;
	}

	public String getNeedComp()
	{
		return needComp;
	}

	public void setNeedComp(String needComp)
	{
		this.needComp = needComp;
	}
	
}
