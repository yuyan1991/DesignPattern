/**
 * 
 */
package com.strategy.ui;

import com.strategy.CashContext;

/**
 * @author yuyan
 *
 */
public class CashUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String payType = "F";
		Double amount = Double.valueOf(1000);

		CashContext ctx = new CashContext(amount, payType);
		System.out.println("Please pay " + ctx.pay());
	}

}
