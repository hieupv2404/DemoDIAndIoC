package springdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import springdemo.service.Coach;
import springdemo.service.FortuneService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("tennisCoachScope")
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor

	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");		
	}
	
	// define a setter method
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside setFortuneService() method");
//		this.fortuneService = theFortuneService;
//	}

	

//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
