package org.mengyun.tcctransaction.sample.capital.domain.entity;

import java.math.BigDecimal;

/**
 * 资金交易单
 */
public class TradeOrder {

	/** 资金交易单ID */
	private long id;
	/** 自己用户ID */
	private long selfUserId;
	/** 对方用户ID */
	private long oppositeUserId;
	/** 商户订单号 */
	private String merchantOrderNo;
	/** 金额 */
	private BigDecimal amount;
	/** 状态 */
	private String status = "DRAFT";
	/** 版本 */
	private long version = 1l;

	public TradeOrder() {
	}

	public TradeOrder(long selfUserId, long oppositeUserId, String merchantOrderNo, BigDecimal amount) {
		this.selfUserId = selfUserId;
		this.oppositeUserId = oppositeUserId;
		this.merchantOrderNo = merchantOrderNo;
		this.amount = amount;
	}

	public long getId() {
		return id;
	}

	public long getSelfUserId() {
		return selfUserId;
	}

	public long getOppositeUserId() {
		return oppositeUserId;
	}

	public String getMerchantOrderNo() {
		return merchantOrderNo;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public String getStatus() {
		return status;
	}

	public void confirm() {
		this.status = "CONFIRM";
	}

	public void cancel() {
		this.status = "CANCEL";
	}

	public long getVersion() {
		return version;
	}

	public void updateVersion() {
		this.version = version + 1;
	}
}
