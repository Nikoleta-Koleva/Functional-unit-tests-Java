package com.tsg.unittesting;

import com.tsg.unittesting.strings.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringsExercisesTest {
    @Test
    public void testYell() {
        StringsExerciseA testA = new StringsExerciseA();
        assertEquals("HELLO", testA.yell("hello"));
        assertEquals("OPENAI", testA.yell("openai"));
        assertEquals("", testA.yell(""));
        assertEquals("123ABC", testA.yell("123abc"));
    }

    @Test
    public void testTripleString() {
        StringsExerciseB testB = new StringsExerciseB();
        assertEquals("helloHELLOhello", testB.tripleIt("hello"));
        assertEquals("", testB.tripleIt(""));
        assertEquals("123abc123ABC123abc", testB.tripleIt("123abc"));
    }

    @Test
    public void testRemoveVowels() {
        StringsExerciseC testC = new StringsExerciseC();
        assertEquals("trnct", testC.removeTheVowels("truncate"));
        assertEquals("sqshd", testC.removeTheVowels("squashed"));
        assertEquals("cmprssd", testC.removeTheVowels("compressed"));

    }

    @Test
    public void testReversePhrase() {
        StringsExerciseD testD = new StringsExerciseD();
        assertEquals("semit nuf", testD.simpleReverse("fun times"));
        assertEquals("kcud amall amall", testD.simpleReverse("llama llama duck"));
        assertEquals("hannah", testD.simpleReverse("hannah"));

    }

    @Test
    public void testContainsTheOther() {
        StringsExerciseE tester = new StringsExerciseE();
        assertTrue(tester.containsTheOther("one", "tone"));
        assertFalse(tester.containsTheOther("same", "same"));
        assertTrue(tester.containsTheOther("fancypants", "pants"));
        assertFalse(tester.containsTheOther("llama", "duck"));
    }

    @Test
    public void testLongestWord() {
        StringsExerciseF tester = new StringsExerciseF();
        assertEquals("perspiration", tester.longestWord("Invention my dear friends is 93% perspiration 6% electricity 4% evaporation and 2% butterscotch ripple"));
        assertEquals("well-established", tester.longestWord("All well-established principles should be periodically challenged"));
        assertEquals("Never", tester.longestWord("Never argue with the data"));
    }
}