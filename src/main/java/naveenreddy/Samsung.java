package naveenreddy;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
@Bean	
public void config() {
	System.out.println("Octa Core, 4gb Ram, 12MP Camera");
}
}
