package lamt.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleBootRestWeb {
    
    @RequestMapping("/")
    public String welcome(){
        return "Hello!!!!"; 
    }
    
    public static void main(String[] args){
        SpringApplication.run(SimpleBootRestWeb.class, args);
    }
}
