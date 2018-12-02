/**
 * 
 */
package com.strategy.cash;

/**
 * @author yuyan
 *
 */
public class CashNormal extends CashSuper {
	/* (non-Javadoc)
	 * @see com.strategy.cash.CashSuper#accept(java.lang.Double)
	 */
	@Override
	public Double accept(Double amount) {
		return amount;
	}

}
