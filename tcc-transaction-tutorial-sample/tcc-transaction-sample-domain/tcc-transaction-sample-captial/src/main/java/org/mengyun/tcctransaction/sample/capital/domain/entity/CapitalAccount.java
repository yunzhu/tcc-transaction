package org.mengyun.tcctransaction.sample.capital.domain.entity;

import org.mengyun.tcctransaction.sample.exception.InsufficientBalanceException;

import java.math.BigDecimal;

/**
 * 资金账户
 * 
 * Created by changming.xie on 4/2/16.
 */
public class CapitalAccount {

	/** 资金账户ID */
	private long id;
	/** 用户ID */
	private long userId;

	/** 资金余额 */
	private BigDecimal balanceAmount;

	private BigDecimal transferAmount = BigDecimal.ZERO;

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

		transferAmount = transferAmount.add(amount.negate());
	}

	public void transferTo(BigDecimal amount) {
		this.balanceAmount = this.balanceAmount.add(amount);
		transferAmount = transferAmount.add(amount);
	}

	public void cancelTransfer(BigDecimal amount) {
		transferTo(amount);
	}
}
