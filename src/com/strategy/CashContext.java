/**
 * 
 */
package com.strategy;

import com.strategy.cash.CashCombine;
import com.strategy.cash.CashNormal;
import com.strategy.cash.CashRebate;
import com.strategy.cash.CashReturn;
import com.strategy.cash.CashSuper;

/**
 * @author yuyan
 *
 */
public class CashContext {	
	private CashSuper cash = null;
	private Double amount = null;
	
	public CashContext(Double amount, String payType) {
		this.amount = amount;
		switch (payType) {
			case "A":
				cash = new CashRebate(0.8);
				break;
			case "B":
				cash = new CashRebate(0.5);
				break;
			case "C":
				cash = new CashReturn((double)100, (double)50);
				break;
			case "D":
				cash = new CashReturn((double)100, (double)30);
				break;
			case "E":
				cash = new CashCombine(0.9, (double)100, (double)20);
				break;
			default:
				cash = new CashNormal();
		}
	}
	
	public String pay() {
		return Double.toString(cash.accept(amount));
	}
}
