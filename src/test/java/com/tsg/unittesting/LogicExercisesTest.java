package com.tsg.unittesting;

import com.tsg.unittesting.logic.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogicExercisesTest {
    @Test
    public void testFriendlyGreeting() {
        LogicExerciseA testA = new LogicExerciseA();
        // Test when the visitor is a friend
        assertEquals("Hello, Goofus!", testA.friendlyGreeting("Goofus", true));
        assertEquals("Hello, Gallant!", testA.friendlyGreeting("Gallant", true));

        // Test when the visitor is not a friend
        assertEquals("hi", testA.friendlyGreeting("Goofus", false));
        assertEquals("hi", testA.friendlyGreeting("Gallant", false));

        // Test when visitorName is null
        assertEquals("...", testA.friendlyGreeting(null, false));
    }

    @Test
    public void testPlaceOf() {
        LogicExerciseB testB = new LogicExerciseB();
        assertEquals("1st", testB.placeOf(1));
        assertEquals("2nd", testB.placeOf(2));
        assertEquals("3rd", testB.placeOf(3));
        assertEquals("4th", testB.placeOf(4));
        assertEquals("11th", testB.placeOf(11));
        assertEquals("12th", testB.placeOf(12));
        assertEquals("13th", testB.placeOf(13));
        assertEquals("22nd", testB.placeOf(22));
        assertEquals("31st", testB.placeOf(31));
        assertEquals("42nd", testB.placeOf(42));
        assertEquals("53rd", testB.placeOf(53));
        assertEquals("64th", testB.placeOf(64));
        assertEquals("75th", testB.placeOf(75));
        assertEquals("86th", testB.placeOf(86));
        assertEquals("97th", testB.placeOf(97));
        assertEquals("100th", testB.placeOf(100));
    }

    @Test
    public void testWillTakeDogOut() {
        LogicExerciseC testC = new LogicExerciseC();
        // Test case 1: Light outside, not raining, temperature within range
        assertTrue(testC.goWalky(true, false, false, false, 70));

        // Test case 2: Not light outside, has flashlight, raining, but has umbrella, temperature within range
        assertTrue(testC.goWalky(false, true, true, true, 65));

        // Test case 3: Not light outside, no flashlight, raining, no umbrella, temperature within range
        assertFalse(testC.goWalky(false, false, true, false, 80));

        // Test case 4: Light outside, not raining, temperature too hot
        assertFalse(testC.goWalky(true, false, false, false, 100));

        // Test case 5: Light outside, not raining, temperature too cold
        assertFalse(testC.goWalky(true, false, false, false, 40));
    }

    @Test
    public void testIsFirstTheFirst() {
        LogicExerciseD testD = new LogicExerciseD();
        assertTrue(testD.isFirstTheFirst('a', 'b'));
        assertTrue(testD.isFirstTheFirst('O', 'X'));
        assertFalse(testD.isFirstTheFirst('Z', 'z'));
    }

    @Test
    public void testWhatColor() {
        LogicExerciseE logic = new LogicExerciseE();

        //test exact matches
        assertEquals("Yellow", logic.whatColor(575, 510, 2.15));
        assertEquals("Violet", logic.whatColor(449, 670, 3.00));
        assertEquals("Orange", logic.whatColor(590, 508, 2.05));
        assertEquals("Red", logic.whatColor(621, 475, 1.80));

        //test unknown values
        assertEquals("Unknown", logic.whatColor(621, 475, 16.5));
        assertEquals("Unknown", logic.whatColor(1000, 200, 0.5));
        assertEquals("Unknown", logic.whatColor(380, 400, 3.00));

        //test additional cases
        assertEquals("Violet", logic.whatColor(380, 789, 3.26));
        assertEquals("Blue", logic.whatColor(450, 606, 2.50));
        assertEquals("Green", logic.whatColor(495, 526, 2.17));
        assertEquals("Yellow", logic.whatColor(570, 508, 2.10));
        assertEquals("Orange", logic.whatColor(590, 484, 2.00));
        assertEquals("Red", logic.whatColor(620, 400, 1.65));
    }
}