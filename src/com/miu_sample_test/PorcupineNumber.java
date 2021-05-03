package com.miu_sample_test;


/**
 * A prime number is an integer that is divisible only by 1 and itself.
 * A porcupine number is a prime number whose last digit is 9 and the next
 * prime number that follows it also ends with the digit 9.
 * For example 139 is a porcupine number because:
 * a. it is prime
 * b. it ends in a 9
 * c. The next prime number after it is 149 which also ends in 9. Note that
 * 140, 141, 142, 143, 144, 145, 146, 147 and 148 are not prime so 149 is the
 * next prime number after 139.
 * <p>
 * Write a method named findPorcupineNumber which takes an integer argument n
 * and returns the first porcupine number that is greater than n.
 * So findPorcupineNumber(0) would return 139 (because 139 happens to be the
 * first porcupine number) and so would findPorcupineNumber(138). But
 * findPorcupineNumber(139) would return 409 which is the second porcupine number.
 */
public class PorcupineNumber {

	public int findPorcupineNumber(int num) {
		num++;
		while (!(isPrime(num) && endsWithNine(num) && nextPrimeEndsWithNine(num))) num++;
		return num;
	}

	boolean nextPrimeEndsWithNine(int num) {
		int nextPrime = num + 1;
		while (!isPrime(nextPrime)) nextPrime++;
		return endsWithNine(nextPrime);
	}

	boolean isPrime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}

	boolean endsWithNine(int num) {
		return num % 10 == 9;
	}
}
