/**
 * 
 */
package com.simple.factory.operation;

/**
 * @author user
 *
 */
public class DivisionOperation extends Operation {

	/* (non-Javadoc)
	 * @see com.simple.factory.operation.Operation#calculate(java.lang.Double, java.lang.Double)
	 */
	@Override
	public Double calculate(Double num1, Double num2) {
		Double result = null;
		try {
			result = num1 / num2;
		} catch (ArithmeticException ae) {
			System.out.println("Cannot divided by zero!");
			ae.printStackTrace();
		}
		return result;
	}

}
