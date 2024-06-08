package com.tsg.unittesting;

import com.tsg.unittesting.arrays.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExercisesTest {
    @Test
    public void testMaxOfArray() {
        ArrayExerciseA testA = new ArrayExerciseA();
        assertEquals(1, testA.maxOfArray(new int[]{1}));
        assertEquals(5, testA.maxOfArray(new int[]{3, 4, 5}));
        assertEquals(-3, testA.maxOfArray(new int[]{-9000, -700, -50, -3}));
    }

    @Test
    public void testMultiplyAll() {
        ArrayExerciseB testB = new ArrayExerciseB();
        assertArrayEquals(new int[]{5, 10, 15, 20, 25}, testB.multiplyAll(5, new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0}, testB.multiplyAll(0, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertArrayEquals(new int[]{2, 0, 0, -1}, testB.multiplyAll(-1, new int[]{-2, 0, 0, 1}));
    }

    @Test
    public void testStringThemTogether() {
        ArrayExerciseC testC = new ArrayExerciseC();
        assertEquals("1337", testC.stringThemTogether(new int[]{1, 3, 3, 7}));
        assertEquals("133555777799999", testC.stringThemTogether(new int[]{1, 33, 555, 7777, 99999}));
        assertEquals("", testC.stringThemTogether(new int[]{}));

    }

    @Test
    public void testPointFree() {
        ArrayExerciseD testD = new ArrayExerciseD();
        assertEquals(22, testD.pointFree(new double[]{1.1, .22}));
        assertEquals(5005, testD.pointFree(new double[]{.039, 20, .005005}));
        assertEquals(-5, testD.pointFree(new double[]{-9.9, -700, -.5}));
    }

    @Test
    public void testCamelCaseIt() {
        ArrayExerciseE testE = new ArrayExerciseE();
        assertEquals("llamaLlamaDuck", testE.camelCaseIt(new String[]{"llama", "llama", "duck"}));
        assertEquals("lambsEatOatsAndDoesEatOats", testE.camelCaseIt(new String[]{"lambs", "eat", "oats", "and", "does", "eat", "oats"}));
        assertEquals("doOrDoNotThereIsNoTry", testE.camelCaseIt(new String[]{"DO", "OR", "DO", "NOT", "THERE", "IS", "NO", "TRY"}));
    }
}