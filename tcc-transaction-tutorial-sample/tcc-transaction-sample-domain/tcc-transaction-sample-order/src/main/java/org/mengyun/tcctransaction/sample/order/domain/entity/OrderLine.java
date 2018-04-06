package org.mengyun.tcctransaction.sample.order.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单项目
 * 
 * Created by changming.xie on 4/1/16.
 */
public class OrderLine implements Serializable {

	private static final long serialVersionUID = 2300754647209250837L;

	/** 订单项目ID */
	private long id;
	/** 产品ID */
	private long productId;
	/** 数量 */
	private int quantity;
	/** 单价 */
	private BigDecimal unitPrice;

	public OrderLine() {

	}

	public OrderLine(Long productId, Integer quantity, BigDecimal unitPrice) {
		this.productId = productId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public long getProductId() {
		return productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public BigDecimal getTotalAmount() {
		return unitPrice.multiply(BigDecimal.valueOf(quantity));
	}

	public long getId() {
		return id;
	}
}
