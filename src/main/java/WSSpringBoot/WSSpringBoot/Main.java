package WSSpringBoot.WSSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class Main {
	
	@RequestMapping("/")
    @ResponseBody
    public String index(){
        return "funciona?";
    }
	
    public static void main( String[] args ) throws Exception{
        System.out.println( "Hello World!" );
        SpringApplication.run(Main.class, args);
    }
    
}
