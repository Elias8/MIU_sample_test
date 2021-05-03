package com.miu_sample_test;

public class CountSquarePair {

	// Time complexity: O(n^2)
	// Space complexity: O(1)
	public int countSquarePairs(int[] a) {
		if (a.length < 1) return 0;
		int count = 0;
		for (int x : a) {
			for (int y : a) {
				if (isPerfectSquare(x, y)) count++;
			}
		}
		return count;
	}

	private boolean isPerfectSquare(int x, int y) {
		double squareRoot = Math.sqrt(x + y);
		boolean isInteger = squareRoot == (int) squareRoot;
		boolean isPerfect = x > 0 && y > 0 && x < y;
		return isInteger && isPerfect;
	}
}
