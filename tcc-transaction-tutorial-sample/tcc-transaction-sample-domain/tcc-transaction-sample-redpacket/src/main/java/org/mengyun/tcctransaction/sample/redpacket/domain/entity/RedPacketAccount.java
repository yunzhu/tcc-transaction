package org.mengyun.tcctransaction.sample.redpacket.domain.entity;

import org.mengyun.tcctransaction.sample.exception.InsufficientBalanceException;

import java.math.BigDecimal;

/**
 * 红包账户
 * 
 * Created by changming.xie on 4/2/16.
 */
public class RedPacketAccount {

	/** 红包账户ID */
	private long id;
	/** 红包余额 */
	private long userId;
	/** 用户ID */
	private BigDecimal balanceAmount;

	public long getUserId() {
		return userId;
	}

	public BigDecimal getBalanceAmount() {
		return balanceAmount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void transferFrom(BigDecimal amount) {
		this.balanceAmount = this.balanceAmount.subtract(amount);

		if (BigDecimal.ZERO.compareTo(this.balanceAmount) > 0) {
			throw new InsufficientBalanceException();
		}
	}

	public void transferTo(BigDecimal amount) {
		this.balanceAmount = this.balanceAmount.add(amount);
	}

	public void cancelTransfer(BigDecimal amount) {
		transferTo(amount);
	}
}
