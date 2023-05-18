package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" endpoint that returns "Hello World"
    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World!";
    }

    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!!";
    }

    //expose a new endpoint for "fortune"

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your luck day.";
    }


    @GetMapping("/Intense")
    public String getDailyBoom(){
        return "Amazing demon_intense";
    }



}
