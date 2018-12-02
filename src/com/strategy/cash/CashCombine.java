/**
 * 
 */
package com.strategy.cash;

/**
 * @author yuyan
 *
 */
public class CashCombine extends CashSuper {
	private Double discount = null;
	private Double limit = null;
	private Double ret = null;

	public CashCombine(Double discount, Double limit, Double ret) {
		this.discount = discount;
		this.limit = limit;
		this.ret = ret;
	}

	/* (non-Javadoc)
	 * @see com.strategy.cash.CashSuper#accept(java.lang.Double)
	 */
	@Override
	public Double accept(Double amount) {
		return amount * discount - (int)(amount * discount / limit) * ret;
	}
}
