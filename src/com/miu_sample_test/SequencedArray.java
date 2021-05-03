package com.miu_sample_test;

public class SequencedArray {

	// Time complexity: O(n) and
	// Space complexity: O(1), where n is the length of the array
	public int isSequence(int[] array, int m, int n) {
		if (array.length == 0) return 0;
		if (array[0] != m || array[array.length - 1] != n) return 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1] && array[i] != array[i + 1] - 1) {
				return 0;
			}
		}
		return 1;
	}
}
