package com.miu_sample_test;

/**
 * Write a function named primeCount that returns the number of
 * primes between start and end, inclusive. Recall that a prime is
 * a positive integer greater than 1 whose only integer factors are
 * 1 and itself
 */
public class PrimeCount {
    public int primeCount(int start, int end) {
        int count = 0;
        if (start < 2) start = 2;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

