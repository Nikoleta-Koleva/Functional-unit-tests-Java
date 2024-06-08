/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.logic;

public class LogicExerciseD {

    /**
     * Given two characters, return true if the first letter parameter comes 
     * earlier in the alphabet than the second letter parameter. 
     * Don't worry about casing, just turn consider everything in lowercase.
     *
     * Ex:
     * isFirstTheFirst( 'a' , 'b'  ) ->  true
     * isFirstTheFirst( 'O' , 'X'  ) ->  true
     * isFirstTheFirst( 'Z' , 'z'   ) -> false
     * 
     * @param letterOne
     * @param letterTwo
     * @return boolean
     */
    public boolean isFirstTheFirst(char letterOne, char letterTwo) {
        char firstLower = Character.toLowerCase(letterOne);
        char secondLower = Character.toLowerCase(letterTwo);
        return firstLower < secondLower;
    }
}
