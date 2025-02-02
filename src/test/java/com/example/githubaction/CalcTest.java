package com.example.githubaction;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    private Calc calc = new Calc();

    @Test
    void add() {
        assertEquals(3, calc.add(1, 2));
    }

    @Test
    void subtract() {
        assertEquals(-1, calc.subtract(1, 2));
    }

    @Disabled
    @Test
    void wrongTest() {
        assertEquals(1, calc.add(1, 2));
    }

}