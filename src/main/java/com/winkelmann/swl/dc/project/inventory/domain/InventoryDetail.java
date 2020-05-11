package com.winkelmann.swl.dc.project.inventory.domain;

import java.sql.Date;

import com.winkelmann.swl.dc.framework.web.domain.BaseEntity;

public class InventoryDetail extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	// 仓库
	private String warehouse;
	// 库位
	private String location;
	// 批序号
	private String serial;
	// 参考
	private String reference;
	// 物料号
	private String partNbr;
	// 状态
	private String status;
	// 库存量
	private Double qtyOnHand;
	// 备料量
	private Double qtyAlloc;
	// 生成日期
	private Date createDate;
	// 到期日期
	private Date dueDate;
	// 可用
	private String available;	// 1可用0不可用
	// 可计划
	private String nettable;	// 1可计划0不可计划
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getWarehouse()
	{
		return warehouse;
	}
	
	public void setWarehouse(String warehouse)
	{
		this.warehouse = warehouse;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public String getSerial()
	{
		return serial;
	}
	
	public void setSerial(String serial)
	{
		this.serial = serial;
	}
	
	public String getReference()
	{
		return reference;
	}
	
	public void setReference(String reference)
	{
		this.reference = reference;
	}
	
	public String getPartNbr()
	{
		return partNbr;
	}
	
	public void setPartNbr(String partNbr)
	{
		this.partNbr = partNbr;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public Double getQtyOnHand()
	{
		return qtyOnHand;
	}
	
	public void setQtyOnHand(Double qtyOnHand)
	{
		this.qtyOnHand = qtyOnHand;
	}
	
	public Double getQtyAlloc()
	{
		return qtyAlloc;
	}
	
	public void setQtyAlloc(Double qtyAlloc)
	{
		this.qtyAlloc = qtyAlloc;
	}
	
	public Date getCreateDate()
	{
		return createDate;
	}
	
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	
	public Date getDueDate()
	{
		return dueDate;
	}
	
	public void setDueDate(Date dueDate)
	{
		this.dueDate = dueDate;
	}
	
	public String getAvailable()
	{
		return available;
	}
	
	public void setAvailable(String available)
	{
		this.available = available;
	}
	
	public String getNettable()
	{
		return nettable;
	}
	
	public void setNettable(String nettable)
	{
		this.nettable = nettable;
	}
	
}
