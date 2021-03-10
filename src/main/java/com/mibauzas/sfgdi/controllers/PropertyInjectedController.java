package com.mibauzas.sfgdi.controllers;

import com.mibauzas.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
