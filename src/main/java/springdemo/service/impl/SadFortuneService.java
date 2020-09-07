package springdemo.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import springdemo.service.FortuneService;

@Qualifier("sadFortuneService")
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
