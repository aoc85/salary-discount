package model.entity;

import java.math.BigDecimal;

public class Discount {
	private Integer clientId;
	private Integer discountId;
	private BigDecimal discountValue;
	
	public Discount() {
		
	}
	
	public Discount(Integer client_id, Integer discountId, BigDecimal discountValue) {
		this.clientId = client_id;
		this.discountId = discountId;
		this.discountValue = discountValue;
	}

	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public Integer getDiscountId() {
		return discountId;
	}
	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}
	public BigDecimal getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(BigDecimal discountValue) {
		this.discountValue = discountValue;
	}
	
	
}
