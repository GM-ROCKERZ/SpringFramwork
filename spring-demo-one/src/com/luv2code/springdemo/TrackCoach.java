package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	public TrackCoach(){
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
	
		return "just do it:"+fortuneService.getFortune();
	}

	//add an init method 
	public void doStartUpStuff() {
		
		System.out.println("TrackCoach:inside method doStartUpStuff");
	}
	//add a destroy method 
	public void doCleanUpStuff() {
		
		System.out.println("TrackCoach:inside method doCleanUpStuff");
	}
}
