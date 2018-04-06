package org.mengyun.tcctransaction.sample.order.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 产品
 * 
 * Created by twinkle.zhou on 16/11/10.
 */
public class Product implements Serializable {

	private static final long serialVersionUID = -9047989930332075176L;

	/** 产品ID */
	private long productId;
	/** 商店ID */
	private long shopId;
	/** 产品名 */
	private String productName;
	/** 产品单价 */
	private BigDecimal price;

	public Product() {
	}

	public Product(long productId, long shopId, String productName, BigDecimal price) {
		this.productId = productId;
		this.shopId = shopId;
		this.productName = productName;
		this.price = price;
	}

	public long getProductId() {
		return productId;
	}

	public long getShopId() {
		return shopId;
	}

	public String getProductName() {
		return productName;
	}

	public BigDecimal getPrice() {
		return price;
	}
}
