package com.miu_sample_test;

/**
 * A Madhav array has
 * the following property.
 * a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
 * The length of a Madhav array must be n*(n+1)/2 for some n.
 * <p>
 * Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array,
 * otherwise it returns 0.
 */
public class MadhavArray {

    // Time complexity: O(n) and
    // Space complexity: O(1), where n is the length of the array
    public int isMadhavArray(int[] a) {
        int count = 1;
        for (int i = 1; i < a.length; i += count) {
            int sum = 0;
            for (int j = 0; j <= count; j++) {
                int index = i + j;
                if (index >= a.length) return 0;
                sum += a[index];
            }
            count++;
            if (a[0] != sum) return 0;
        }
        return 1;
    }
}
