import com.miu_sample_test.SumFactor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumFactorTest {

	@Test
	public void sumFactor() {
		int[] array1 = {3, 0, 2, -5, 0};
		int[] array2 = {9, -3, -3, -1, -1};
		int[] array3 = {1};
		int[] array4 = {0, 0, 0};

		SumFactor sumFactor = new SumFactor();

		assertEquals(sumFactor.sumFactor(array1), 2);
		assertEquals(sumFactor.sumFactor(array2), 0);
		assertEquals(sumFactor.sumFactor(array3), 1);
		assertEquals(sumFactor.sumFactor(array4), 3);
	}
}
