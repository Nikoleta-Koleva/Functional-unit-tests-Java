/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.strings;

public class StringsExerciseC {

    /**
     * Take a word, and remove all its vowels and returns it.
     *
     * Ex:
     * removeTheVowels( "truncate" ) ->  "trnct"
     * removeTheVowels( "squashed" ) ->  "sqshd"
     * removeTheVowels( "compressed" ) ->  "cmprssd"
     * @param word
     * @return String
     */
    public String removeTheVowels(String word){
        return word.replaceAll("[aeiouAEIOU]", "");
    }
    
}
