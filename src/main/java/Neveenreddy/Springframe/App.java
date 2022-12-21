package Neveenreddy.Springframe;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Car obj2= (Car)context.getBean("car");
        obj2.drive();
    	
    	
    	
     
    }
     
}
 