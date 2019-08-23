package com.thoughtworks.tdd;


public class FizzBuzzNumberGame {
	public FizzBuzzNumberGame() {
		
	}
	public String fizzBuzz(int number) {
		// TODO Auto-generated method stub
		if(number %3==0 && number % 5 == 0 && number % 7 == 0) {
			return "fizzBuzzWhizz";
			
		}else if(number % 5 == 0 && number % 7 == 0) {
			return "buzzWhizz";
			
		}else if(number % 3 == 0 && number % 7 == 0) {
			return "fizzWhizz";
		}
		else if(number % 3 == 0 && number % 5 == 0) {
			return "fizzBuzz";
		}
		else if(number%3==0) {
			return "fizz";
		}
		else if(number % 5 == 0){
			return "buzz";
		}else if(number % 7 == 0) {
			return "whizz";
		}
		else {
			return "1";
		}
	}

}
