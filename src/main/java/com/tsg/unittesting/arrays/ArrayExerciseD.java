/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.arrays;

public class ArrayExerciseD {
    
    /**
     * Given an array of doubles, return the biggest number of the lot, as if the decimal had gone missing!
     *
     * 
     * pointFree( [1.1, .22]  ) ->  22
     * pointFree( [ .039 , 20 , .005005 ]  ) ->  5005
     * pointFree( [ -9.9 , -700 , -.5  ]  ) ->  -5
     * 
     * @param numbers
     * @return
     */
    public int pointFree(double[] nums) {
        int max = removeDecimal(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int current = removeDecimal(nums[i]);
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    private int removeDecimal(double num) {
        String numStr = Double.toString(num);
        int decimalIndex = numStr.indexOf('.');
        if (decimalIndex != -1) {
            numStr = numStr.substring(0, decimalIndex) + numStr.substring(decimalIndex + 1);
        }
        return Integer.parseInt(numStr);
    }
}
