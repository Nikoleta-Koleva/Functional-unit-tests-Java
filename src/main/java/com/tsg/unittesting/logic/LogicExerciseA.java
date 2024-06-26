/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.logic;

public class LogicExerciseA {

    /**
     * This is a shy method. 
     * 
     * It only likes to greet friends by name with a hearty hello, 
     * but strangers just get a simple quiet 'hi'. Given the name of who's visiting, 
     * and a boolean of whether or not they're a friend, return the proper greeting.
     * Keep in mind, you greet named visitors, but not the nameless!
     * 
     * friendlyGreeting( "Goofus" , false ) ->   "hi"
     * friendlyGreeting( "Gallant" , true ) ->   "Hello, Gallant!"
     * friendlyGreeting( null , false ) ->   "..."
     * 
     * @param visitorName
     * @param isFriend
     * @return String greeting
     */
    public String friendlyGreeting(String visitorName, boolean isFriend) {
        if (visitorName == null) {
            return "...";
        } else if (isFriend) {
            return "Hello, " + visitorName + "!";
        } else {
            return "hi";
        }
    }

}
