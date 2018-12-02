/**
 * 
 */
package com.strategy.cash;

/**
 * @author yuyan
 *
 */
public class CashRebate extends CashSuper {
	private Double discount = null;

	public CashRebate(Double discount) {
		this.discount = discount;
	}

	/* (non-Javadoc)
	 * @see com.strategy.cash.CashSuper#accept(java.lang.Double)
	 */
	@Override
	public Double accept(Double amount) {
		return amount * discount;
	}

}
