package com.khushi;

public class MainApp {

	public static void main(String[] args) {
		
		ArithmaticOperation addition = (a, b) -> a+b;
		ArithmaticOperation subtraction = (a, b) -> a-b;
		ArithmaticOperation multiplication = (a, b) -> a*b;
		ArithmaticOperation division = (a, b) -> {
			
			if (b ==0) {
				throw new ArithmeticException("divide by zero");
			}
			return a / b;
		
	};
	
	System.out.println(performOperation(9.30, 5.45, addition));
	System.out.println(performOperation(4.5d, 8.05 , subtraction));
	System.out.println(performOperation(9.56, 4.87, multiplication));
	System.out.println(performOperation(100.09, 5.34, division));


}

	private static double performOperation(double a, double b, ArithmaticOperation operation) {
		return operation.operate(a, b);
		
	}
}