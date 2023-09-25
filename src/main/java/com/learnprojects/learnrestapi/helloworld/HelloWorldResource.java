package com.learnprojects.learnrestapi.helloworld;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
    @RequestMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping("/hello-world-path-param/{name}/message/{message}")
    public HelloWorldBean helloWorldMultiplePathParam(@PathVariable String name,
                                                      @PathVariable String message) {
        return new HelloWorldBean("Hello World " + name + ", " + message);
    }


}
