package com.mibauzas.sfgdi.controllers;

import com.mibauzas.sfgdi.services.GreetingServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectionControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
        
    }
}
