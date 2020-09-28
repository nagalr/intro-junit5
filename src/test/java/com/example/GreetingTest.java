package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("In before all");
    }

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
        System.out.println("In before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("In after each");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("In after all");
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Queen"));
    }
}

