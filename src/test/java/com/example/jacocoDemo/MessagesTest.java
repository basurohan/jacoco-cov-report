package com.example.jacocoDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessagesTest {

    Messages messages;

    @BeforeEach
    void setUp() {
        messages = new Messages();
    }

    @Test
    void getMessageNull() {
        assertEquals("Please provide a name!", messages.getMessage(null));
    }

    @Test
    void getMessageEmpty() {
        assertEquals("Please provide a name!", messages.getMessage(""));
    }

    @Test
    void getMessage() {
        assertEquals("Hello Rohan", messages.getMessage("Rohan"));
    }
}