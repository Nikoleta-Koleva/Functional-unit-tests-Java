/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.arrays;

public class ArrayExerciseE {
    
    /**
     * Given an array of words turn it into a single camelCased phrase.
     * Lower case the first word, capitalize the first letter (but only the first) of the rest.
     *
     * camelCaseIt( {"llama", "llama", "duck"}  ) ->  "llamaLlamaDuck"
     * camelCaseIt( {"lambs", "eat", "oats", "and", "does", "eat", "oats"}  ) ->  "lambsEatOatsAndDoesEatOats"
     * camelCaseIt( {"DO", "OR", "DO", "NOT", "THERE", "IS", "NO", "TRY"}  ) ->  "doOrDoNotThereIsNoTry"
     * @param words
     * @return String camelCased phrase
     */

    public String camelCaseIt(String[] words){
        StringBuilder camelCasePhrase = new StringBuilder();
        camelCasePhrase.append(words[0].toLowerCase()); // Lower case the first word
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            camelCasePhrase.append(word.substring(0, 1).toUpperCase()); // Capitalize the first letter
            camelCasePhrase.append(word.substring(1).toLowerCase()); // Lower case the rest of the word
        }
        return camelCasePhrase.toString();
    }
    
}
