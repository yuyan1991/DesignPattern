/**
 * 
 */
package com.simple.factory.operation;

/**
 * @author user
 *
 */
public class MultiplyOperation extends Operation {

	/* (non-Javadoc)
	 * @see com.simple.factory.operation.Operation#calculate(java.lang.Double, java.lang.Double)
	 */
	@Override
	public Double calculate(Double num1, Double num2) {
		return num1 * num2;
	}

}
