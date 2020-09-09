package springdemo.service.impl;

import org.springframework.stereotype.Component;
import springdemo.service.FortuneService;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = { 
			"The Rainny Day",
			"The Sunny Day",
			"The Cloudy Day"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
		
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}


