package com.eurotech.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {



    @Before
    public void setup(){
        System.out.println("\tThis is coming from Before Method");
    }

    @After
    public void tearDown(){
        System.out.println("\tThis is coming from After Method");
    }

    @Before("@db")
    public void setUpDb(){
        System.out.println("\tConnecting DB");

    }
    @After("@db")
    public void closeDb(){
        System.out.println("\tDisconnecting DB");

    }
}
