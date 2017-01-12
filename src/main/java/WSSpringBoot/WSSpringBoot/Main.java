package WSSpringBoot.WSSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class Main extends SpringBootServletInitializer{
	

    public static void main( String[] args ) throws Exception{
        System.out.println( "Hello World!" );
        SpringApplication.run(Main.class, args);
    }
    
}
