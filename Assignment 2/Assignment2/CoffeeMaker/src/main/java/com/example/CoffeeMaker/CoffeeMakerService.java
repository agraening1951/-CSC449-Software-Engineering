package com.example.CoffeeMaker;

import org.springframework.stereotype.Service;
@Service

public class CoffeeMakerService {

    public void brewCoffee() {
        System.out.println("Brewing Coffee");
    }

    public void refillWater() {
        System.out.println("Refill water");
    }

    public void refillBeans() {
        System.out.println("Refill Beans");
    }
}
