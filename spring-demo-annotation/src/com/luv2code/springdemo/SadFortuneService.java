package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "Today is not a good day!!";
	}

}
