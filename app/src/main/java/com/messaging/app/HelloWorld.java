package com.messaging.app;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class HelloWorld {
   

    //UC-1 GET Hello Request API
    @GetMapping(value = {"/", "/hello",""})
    public String hello(){
        return "Hello from BridgeLabz!";
    }
    
    //UC-2 GET Request Method and pass name as query parameter
    @GetMapping("/query")    
    public String sayHello(@RequestParam(defaultValue = "Sonu Sharma") String name){
        return "Hello " + name + "!";
    }

    //UC-3 Parameter using Path Variable
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable("name") String name){
        return "Hello " + name + "!";
    }   

    //UC-4 Use           and pass first name and last name in the Body
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
    
}
