package model.dto;

import java.math.BigDecimal;

public class EmployeeSalary {

	private Integer clientId;
	private String clientName;
	private BigDecimal grossSalary;
	private BigDecimal discounts;
	private BigDecimal liquidSalary;

	public EmployeeSalary() {

	}

	public EmployeeSalary(Integer clientId, String clientName, BigDecimal grossSalary, BigDecimal discounts, BigDecimal liquidSalary) {
		this.clientId = clientId;
		this.clientName = clientName;
		this.grossSalary = grossSalary;
		this.discounts = discounts;
		this.liquidSalary = liquidSalary;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public BigDecimal getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(BigDecimal grossSalary) {
		this.grossSalary = grossSalary;
	}

	public BigDecimal getDiscounts() {
		return discounts;
	}

	public void setDiscounts(BigDecimal discounts) {
		this.discounts = discounts;
	}

	public BigDecimal getLiquidSalary() {
		return liquidSalary;
	}

	public void setLiquidSalary(BigDecimal liquidSalary) {
		this.liquidSalary = liquidSalary;
	}

	@Override
	public String toString() {
		return "EmployeeSalary [clientId=" + clientId + ", clientName=" + clientName + ", grossSalary=" + grossSalary
				+ ", discounts=" + discounts + ", liquidSalary=" + liquidSalary + "]";
	}

}
