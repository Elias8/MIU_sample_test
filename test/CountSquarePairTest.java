import com.miu_sample_test.CountSquarePair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountSquarePairTest {

	@Test
	public void countSquarePairsTest() {
		int[] array1 = {9, 0, 2, -5, 7};
		int[] array2 = {9};
		int[] array3 = {11, 5, 4, 20};

		CountSquarePair countSquarePair = new CountSquarePair();

		assertEquals(2, countSquarePair.countSquarePairs(array1));
		assertEquals(0, countSquarePair.countSquarePairs(array2));
		assertEquals(3, countSquarePair.countSquarePairs(array3));
	}
}
