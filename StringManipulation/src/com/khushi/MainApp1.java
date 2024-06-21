package com.khushi;

public class MainApp1 {

	public static void main(String[] args) {
		
		StringTransformation toUpperCase = s-> s.toUpperCase();
		StringTransformation reverseString = s-> new StringBuilder(s).reverse().toString();
		
		System.out.println(toUpperCase.transform("welcome"));
		System.out.println(reverseString.transform("wipro"));
		
		StringTest isPalindrome = s-> s.equals(new StringBuilder(s).reverse().toString());
		CharacterTest containsCharacter = (s, c)-> s.contains(String.valueOf(c));
		
		System.out.println(isPalindrome.test("malayalam"));
		System.out.println(containsCharacter.test("abcd", 'a'));
		
		ArithmeticOperation power = (x, y)-> Math.pow(x, y);
		System.out.println(power.operate(23, 46));
		
		StringTransformation formatString = s -> s.chars()
				.mapToObj(c -> String.valueOf((char) c))
				.reduce((a, b) -> a + " " + b)
				.orElse(" ");
		System.out.println(formatString.transform("CG"));
		
		Authentication auth = (username, password) -> username.equals("user") && password.equals("pass");
		System.out.println(auth.authentication("user", "pas"));
		
		
	}

}
