package com.khushi;

public class LambdaEx {

	public static void main(String[] args) {
		StringOperation reverseOperation = (String s) -> new StringBuilder(s).reverse().toString();
		String result = applyOperation("welcome", reverseOperation);
		System.out.println(result);
	}

	public static String applyOperation(String s, StringOperation operation) {
				return operation.operate(s);
	}
	
	

}
