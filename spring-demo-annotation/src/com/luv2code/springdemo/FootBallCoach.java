package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("soccer")
public class FootBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Do something and make it count every Single Goal!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
