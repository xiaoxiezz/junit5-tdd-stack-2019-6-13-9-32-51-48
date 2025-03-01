package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzNumberGameTest {
//	@Test
//	public void should_return_1_when_fizzBuzz_given_1() {
//		given
//		int number=1;
//		FizzBuzzNumberGame fizzBuzzNumberGame=new FizzBuzzNumberGame();
//		when
//		String word=fizzBuzzNumberGame.fizzBuzz(number);
//		then
//		Assertions.assertEquals("1", word);
//	}
	
	@Test
	public void should_return_fizz_when_fizzBuzz_given_3() {
//		given
		int number=3;
		FizzBuzzNumberGame fizzBuzzNumberGame=new FizzBuzzNumberGame();
//		when
		String word=fizzBuzzNumberGame.fizzBuzz(number);
//		then
		Assertions.assertEquals("fizz", word);
	}
	
	@Test
	public void should_return_buzz_when_fizzBuzz_given_5() {
		int number=5;
		FizzBuzzNumberGame fizzBuzzNumberGame=new FizzBuzzNumberGame();
		String word=fizzBuzzNumberGame.fizzBuzz(number);
		Assertions.assertEquals("buzz", word);
	}
	
	@Test
	public void should_return_whizz_when_fizzBuzz_given_7() {
		int number=7;
		FizzBuzzNumberGame fizzBuzzNumberGame=new FizzBuzzNumberGame();
		String word=fizzBuzzNumberGame.fizzBuzz(number);
		Assertions.assertEquals("whizz", word);
	}
	
	@Test
	public void should_return_fizzBuzz_when_fizzBuzz_given_15() {
		int number=15;
		FizzBuzzNumberGame fizzBuzzNumberGame=new FizzBuzzNumberGame();
		String word=fizzBuzzNumberGame.fizzBuzz(number);
		Assertions.assertEquals("fizzBuzz", word);
	}
	
	@Test
	public void should_return_fizzWhizz_when_fizzBuzz_given_21() {
		int number=21;
		FizzBuzzNumberGame fizzBuzzNumberGame=new FizzBuzzNumberGame();
		String word=fizzBuzzNumberGame.fizzBuzz(number);
		Assertions.assertEquals("fizzWhizz", word);
	}
	
	@Test
	public void should_return_buzzWhizz_when_fizzBuzz_given_35() {
		int number=35;
		FizzBuzzNumberGame fizzBuzzNumberGame=new FizzBuzzNumberGame();
		String word=fizzBuzzNumberGame.fizzBuzz(number);
		Assertions.assertEquals("buzzWhizz", word);
	}
	
//	@Test
//	public void should_return_1_when_fizzBuzz_given_nomal() {
//		for(int i=0;i<100;i++) {
//			int number=i;
//			if(number%3==0) {
//				FizzBuzzNumberGame fizzBuzzNumberGame=new FizzBuzzNumberGame();
//				String word=fizzBuzzNumberGame.fizzBuzz(number);
//				Assertions.assertEquals("fizz", word);
//			}
//		}
//	}
	
	
}
