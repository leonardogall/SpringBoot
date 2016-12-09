package WSSpringBoot.WSSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class Main {
	
    public static void main( String[] args ) throws Exception{
        System.out.println( "Hello World!" );
        SpringApplication.run(Main.class, args);
    }
    
}
