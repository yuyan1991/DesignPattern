/**
 * 
 */
package com.strategy.cash;

/**
 * @author yuyan
 *
 */
public class CashReturn extends CashSuper {
	private Double limit = null;
	private Double ret = null;

	public CashReturn(Double limit, Double ret) {
		this.limit = limit;
		this.ret = ret;
	}

	/* (non-Javadoc)
	 * @see com.strategy.cash.CashSuper#accept(java.lang.Double)
	 */
	@Override
	public Double accept(Double amount) {
		return amount - (int)(amount/limit) * ret;
	}
}
