import com.miu_sample_test.MadhavArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MadhavArrayTest {
	@Test
	public void testIsMadhavArray() {
		int[] array1 = {2, 1, 1};
		int[] array2 = {2, 1, 1, 4, -1, -1};
		int[] array3 = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
		int[] array4 = {18, 9, 10, 6, 6, 6};
		int[] array5 = {-6, -3, -3, 8, -5, -4};
		int[] array6 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
		int[] array7 = {3, 1, 2, 3, 0};

		MadhavArray madhavArray = new MadhavArray();

		assertEquals(madhavArray.isMadhavArray(array1), 1);
		assertEquals(madhavArray.isMadhavArray(array2), 1);
		assertEquals(madhavArray.isMadhavArray(array3), 1);
		assertEquals(madhavArray.isMadhavArray(array4), 0);
		assertEquals(madhavArray.isMadhavArray(array5), 0);
		assertEquals(madhavArray.isMadhavArray(array6), 1);
		assertEquals(madhavArray.isMadhavArray(array7), 0);
	}
}