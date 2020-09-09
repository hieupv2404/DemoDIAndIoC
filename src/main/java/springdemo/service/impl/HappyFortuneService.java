package springdemo.service.impl;

import org.springframework.stereotype.Component;
import springdemo.service.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is happy day!";
	}

}
