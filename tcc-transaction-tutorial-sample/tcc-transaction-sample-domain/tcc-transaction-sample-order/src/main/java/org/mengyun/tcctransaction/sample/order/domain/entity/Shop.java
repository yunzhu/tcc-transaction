package org.mengyun.tcctransaction.sample.order.domain.entity;

/**
 * 商店
 * 
 * Created by changming.xie on 4/1/16.
 */
public class Shop {

	/** 商店ID */
	private long id;

	/** 所有者ID */
	private long ownerUserId;

	public long getOwnerUserId() {
		return ownerUserId;
	}

	public long getId() {
		return id;
	}
}
