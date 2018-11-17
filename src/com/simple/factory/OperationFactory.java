/**
 * 
 */
package com.simple.factory;

import com.simple.factory.operation.AddOperation;
import com.simple.factory.operation.DivisionOperation;
import com.simple.factory.operation.MultiplyOperation;
import com.simple.factory.operation.Operation;
import com.simple.factory.operation.SubtractOperation;

/**
 * @author user
 *
 */
public class OperationFactory {
	public static Operation createOperation(String operator) {
		Operation operation = null;
		switch (operator) {
			case "+":
				operation = new AddOperation();
				break;
			case "-":
				operation = new SubtractOperation();
				break;
			case "*":
				operation = new MultiplyOperation();
				break;
			case "/":
				operation = new DivisionOperation();
				break;
		}
		return operation;
	}
}
