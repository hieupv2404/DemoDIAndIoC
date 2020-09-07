package springdemo.service.impl;

import org.springframework.stereotype.Component;
import springdemo.service.FortuneService;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Database Fortune";
	}

}
