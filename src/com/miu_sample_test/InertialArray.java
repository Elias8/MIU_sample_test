package com.miu_sample_test;

import java.util.ArrayList;
import java.util.List;

/**
 * An array is defined to be inertial if the following conditions hold:
 * a. it contains at least one odd value
 * b. the maximum value in the array is even
 * c. every odd value is greater than every even value that is not the maximum value.
 * <p>
 * Write a function called isIntertial that accepts an integer array and returns 1 if
 * the array is inertial; otherwise it returns 0.
 */

public class InertialArray {
    public int isInertial(int[] a) {
        int maxNum = 0;
        List<Integer> oddNums = new ArrayList<>();
        List<Integer> evenNums = new ArrayList<>();

        for (int num : a) {
            if (num > maxNum) maxNum = num;
            if (num % 2 == 0) {
                evenNums.add(num);
            } else {
                oddNums.add(num);
            }
        }

        if (oddNums.size() < 1) return 0;
        if (maxNum % 2 != 0) return 0;

        for (int oddNum : oddNums) {
            for (int evenNum : evenNums) {
                if (maxNum != evenNum && oddNum < evenNum) return 0;
            }
        }
        return 1;
    }
}
