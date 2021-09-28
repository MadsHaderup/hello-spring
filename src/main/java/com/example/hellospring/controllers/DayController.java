package com.example.hellospring.controllers;
import com.example.hellospring.services.Services;
import org.springframework.web.bind.annotation.*;

@RestController
public class DayController {

    //Opgave 1.1
    @RequestMapping(value="/hello-world")
    public static String Welcome() {
        return "Hello, World!";
    }

    //Opgave 1.2
    @GetMapping(path = {"/input=", "/input={data}"})
    public static String Input(@PathVariable(required=false,name="data") String data){
        return data;
    }

    //Opgave 1.3
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        Services services = new Services();
        if(services.getDate() == 5){
            return "It's FRIDAY!!!";
        } else {
            return "It's not friday :'(";
        }

    }
}
