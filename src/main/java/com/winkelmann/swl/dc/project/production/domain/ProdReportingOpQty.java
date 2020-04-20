package com.winkelmann.swl.dc.project.production.domain;

import java.sql.Date;

import com.winkelmann.swl.dc.framework.web.domain.BaseEntity;

public class ProdReportingOpQty extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private Date prodDate;
	
	private String partProjName;
	
	private String partNumber;
	
	private Double qtyCompleted;
	
	private Double qtyRejected;
	
	private Double qtyScrapped;
	
	private String op;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Date getProdDate()
	{
		return prodDate;
	}

	public void setProdDate(Date prodDate)
	{
		this.prodDate = prodDate;
	}

	public String getPartProjName()
	{
		return partProjName;
	}

	public void setPartProjName(String partProjName)
	{
		this.partProjName = partProjName;
	}

	public String getPartNumber()
	{
		return partNumber;
	}

	public void setPartNumber(String partNumber)
	{
		this.partNumber = partNumber;
	}

	public Double getQtyCompleted()
	{
		return qtyCompleted;
	}

	public void setQtyCompleted(Double qtyCompleted)
	{
		this.qtyCompleted = qtyCompleted;
	}

	public Double getQtyRejected()
	{
		return qtyRejected;
	}

	public void setQtyRejected(Double qtyRejected)
	{
		this.qtyRejected = qtyRejected;
	}
	
	public Double getQtyScrapped()
	{
		return qtyScrapped;
	}

	public void setQtyScrapped(Double qtyScrapped)
	{
		this.qtyScrapped = qtyScrapped;
	}

	public String getOp()
	{
		return op;
	}

	public void setOp(String op)
	{
		this.op = op;
	}
	
}
