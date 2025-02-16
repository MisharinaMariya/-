package ru.home;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GoTest {
    private Go go;

    @BeforeClass
    private void setUp() {
        go = new Go();
    }

    @Test
    public void testGetFactorial() {
        int result = go.getFactorial(6);
        assertEquals(result, 720);
    }
}