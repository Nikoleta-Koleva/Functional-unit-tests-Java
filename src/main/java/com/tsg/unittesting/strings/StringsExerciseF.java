/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.strings;

public class StringsExerciseF {
    
    /**
     * Take in a phrase that has many words separated by spaces. 
     * Return the longest word that you can find within the phrase - 
     * don't forget, hyphenated words are allowed!
     *
     * If there is a tie, return the first instance of a word of that size.
     *
     * Ex:
     * longestWord( "Invention my dear friends is 93% perspiration 6% electricity 4% evaporation and 2% butterscotch ripple" ) ->  "perspiration"
     * longestWord( "All well-established principles should be periodically challenged" ) ->  "well-established"
     * longestWord( "Never argue with the data" ) ->  "Never"
     * 
     * @param aPhrase
     * @return String word
     */
    public String longestWord(String aPhrase){
        String[] words = aPhrase.split("\\s+");
        String longestWord = "";
        int maxLength = 0;
        for (String word : words) {
            // Removing punctuation from the word
            word = word.replaceAll("[^a-zA-Z0-9-]", "");
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }
        return longestWord;
    }
}
