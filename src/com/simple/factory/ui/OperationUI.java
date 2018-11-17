/**
 * 
 */
package com.simple.factory.ui;

import com.simple.factory.OperationFactory;
import com.simple.factory.operation.Operation;

/**
 * @author user
 *
 */
public class OperationUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Double num1 = (double)7;
		Double num2 = (double)11;
		String operator = "/";
		Operation op = OperationFactory.createOperation(operator);
		System.out.println(op.calculate(num1, num2));
	}

}
