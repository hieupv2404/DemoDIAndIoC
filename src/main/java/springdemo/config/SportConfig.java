package springdemo.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import springdemo.service.Coach;
import springdemo.service.FortuneService;
import springdemo.service.impl.SadFortuneService;
import springdemo.service.impl.SwimCoach;
import springdemo.service.impl.TennisCoach;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer
					propertySourcesPlaceHolderConfigurer() {
		
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoachService = new SwimCoach(sadFortuneService());
		
		return mySwimCoachService;
	}

	@Bean
	@Lazy
	public Coach tennisCoach() {
		TennisCoach myTennisCoachService = new TennisCoach();

		return myTennisCoachService;
	}
	
}








