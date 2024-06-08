/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.strings;

public class StringsExerciseD {
    
    /**
     * Given a phrase string - turns the whole thing around.
     * Return the original, but totally backwards to forwards!
     *
     * 
     * Ex:
     * simpleReverse( "fun times" ) ->  "semit nuf"
     * simpleReverse( "llama llama duck" ) ->  "kcud amall amall"
     * simpleReverse( "hannah" ) ->  "hannah"
     * 
     * @param phrase
     * @return String backwards
     */
    public String simpleReverse(String phrase) {
        StringBuilder reversed = new StringBuilder();

        // Iterate through the characters of the phrase in reverse order
        for (int i = phrase.length() - 1; i >= 0; i--) {
            // Append each character to the StringBuilder
            reversed.append(phrase.charAt(i));
        }

        // Convert the StringBuilder to a String and return
        return reversed.toString();
    }
}
