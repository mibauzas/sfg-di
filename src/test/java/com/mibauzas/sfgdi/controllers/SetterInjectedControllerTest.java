package com.mibauzas.sfgdi.controllers;

import com.mibauzas.sfgdi.services.GreetingServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectedControllerTest {
    
    SetterInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }

}
