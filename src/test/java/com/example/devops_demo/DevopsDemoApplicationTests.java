package com.example.devops_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class DevopsDemoApplicationMethodTests {

    private final DevopsDemoApplication app = new DevopsDemoApplication();

    @Test
    void homeReturnsMessage() {
        assertEquals("Hello from DevOps Demo App!", app.home());
    }

    @Test
    void statusReturnsMessage() {
        assertEquals("wrong", app.status());
    }

    @Test
    void homeIsNotEmpty() {
        assertFalse(app.home().isEmpty());
    }

    @Test
    void statusIsNotEmpty() {
        assertFalse(app.status().isEmpty());
    }
}