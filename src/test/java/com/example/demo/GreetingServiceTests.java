package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTests {

    private GreetingService greetingService;

    @BeforeEach
    void setUp() {
        greetingService = new GreetingService();
    }

    @Test
    void greetReturnsHelloWithName() {
        assertEquals("Hello Ke", greetingService.greet("Ke"));
    }

    @Test
    void greetReturnsHelloWithDifferentName() {
        assertEquals("Hello World", greetingService.greet("World"));
    }

    @Test
    void greetWithEmptyString() {
        assertEquals("Hello ", greetingService.greet(""));
    }
}
