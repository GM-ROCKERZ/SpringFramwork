package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String [] data= {
			"Beware of the wolf in sheep's clothing",
			"Diligence is mother of luck!",
			"the journey is the reward"
	};

	private Random myRandom=new Random();
	//create an array of String 

	@Override
	public String getFortune() {

		//pick a random String from the array

		int index=myRandom.nextInt(data.length);

		String theFortune=data[index];

		return theFortune;
	}

}
