package com.example.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello from Spring Boot!";
    }

    // Default values which is expected is "Dude"
    // Is this really the "frontend" or "backend"?
    @RequestMapping(value = "/hello") 
    String helloName(@RequestParam(value = "name", defaultValue = "Charly") String name){
      return "Hello " + name + " from your frontend!" ;
    }    
}
