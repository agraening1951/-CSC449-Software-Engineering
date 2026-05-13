package com.example.CoffeeMaker;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class CoffeeMakerTest {
    @Test
    public void testBrewCoffee() {
        CoffeeMakerService coffeeMakerService = new CoffeeMakerService();
        assertDoesNotThrow(coffeeMakerService::brewCoffee);
    }
    @Test
    public void testRefillWater() {
        CoffeeMakerService coffeeMakerService = new CoffeeMakerService();
        assertDoesNotThrow(coffeeMakerService::refillWater);
    }
}