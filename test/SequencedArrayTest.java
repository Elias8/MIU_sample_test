import com.miu_sample_test.SequencedArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SequencedArrayTest {

	@Test
	public void isSequence() {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {1, 3, 4, 2, 5};
		int[] array3 = {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2};
		int[] array4 = {0, 1, 2, 3, 4, 5};
		int[] array5 = {1, 2, 3, 4};
		int[] array6 = {1, 2, 5};
		int[] array7 = {5, 4, 3, 2, 1};

		SequencedArray sequencedArray = new SequencedArray();

		assertEquals(1, sequencedArray.isSequence(array1, 1, 5));
		assertEquals(0, sequencedArray.isSequence(array2, 1, 5));
		assertEquals(1, sequencedArray.isSequence(array3, -5, -2));
		assertEquals(0, sequencedArray.isSequence(array4, 1, 5));
		assertEquals(0, sequencedArray.isSequence(array5, 1, 5));
		assertEquals(0, sequencedArray.isSequence(array6, 1, 5));
		assertEquals(0, sequencedArray.isSequence(array7, 1, 5));
	}
}
