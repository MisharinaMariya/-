package ru.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoTest {
    private Go go;

    @Test
    void getFactorial() {
        int result = go.getFactorial(5);
        Assertions.assertEquals(120, result);
    }

    @BeforeEach
    void setUp() {
        go = new Go();
    }
}