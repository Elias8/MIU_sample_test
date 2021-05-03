package com.miu_sample_test;

import java.util.HashMap;
import java.util.Map;

public class SumFactor {

	// Time complexity: O(n) and
	// Space complexity: O(n), where n is the length of the array
	public int sumFactor(int[] a) {
		int sum = 0;
		Map<Integer, Integer> occurrences = new HashMap<>();
		for (int num : a) {
			sum += num;
			if (!occurrences.containsKey(num)) occurrences.put(num, 0);
			int occurrence = occurrences.get(num) + 1;
			occurrences.put(num, occurrence);
		}
		return occurrences.getOrDefault(sum, 0);
	}
}
