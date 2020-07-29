package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TenniesCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TenniesCoach() {

		System.out.println(">> TenniesCoach:inside default constructor");
	}
	
	//define my init method 
	@PostConstruct
	public void doMyStartupStuff() {
		
		System.out.println(">> TenniesCoach: inside of doMyStartupStuff()");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		
		System.out.println(">> TenniesCoach: inside doMyCleanupStuff()");
	} 
	
	/*	
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {

		fortuneService=theFortuneService;

		System.out.println(">> TenniesCoach: inside the doSomeCrazystuff() method!");
	}
	 */
	/*
	@Autowired	
	public TenniesCoach(FortuneService thefortuneService) {

				this.fortuneService = thefortuneService;
	}
	 */
	@Override
	public String getDailyWorkout() {

		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
