package springdemo.service.impl;

import org.springframework.stereotype.Component;
import springdemo.service.FortuneService;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is the rest day!";
	}

}
