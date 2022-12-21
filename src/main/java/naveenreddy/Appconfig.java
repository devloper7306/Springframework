package naveenreddy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
	
	@Bean
	public Samsung config  () {
		return new Samsung();
	}

}
