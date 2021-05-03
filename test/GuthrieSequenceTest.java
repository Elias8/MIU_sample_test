import com.miu_sample_test.GuthrieSequence;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuthrieSequenceTest {

	@Test
	public void isGuthrieSequenceTest() {
		int[] array1 = {8, 4, 2, 1};
		int[] array2 = {8, 17, 4, 1};
		int[] array3 = {8, 4, 1};
		int[] array4 = {8, 4, 2};

		GuthrieSequence guthrieSequence = new GuthrieSequence();

		assertEquals(1, guthrieSequence.isGuthrieSequence(array1));
		assertEquals(0, guthrieSequence.isGuthrieSequence(array2));
		assertEquals(0, guthrieSequence.isGuthrieSequence(array3));
		assertEquals(0, guthrieSequence.isGuthrieSequence(array4));
	}
}
