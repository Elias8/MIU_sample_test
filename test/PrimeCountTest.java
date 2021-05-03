import com.miu_sample_test.PrimeCount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeCountTest {

	@Test
	public void primeCountTest() {
		PrimeCount primeCount = new PrimeCount();

		assertEquals(primeCount.primeCount(10, 30), 6);
		assertEquals(primeCount.primeCount(11, 29), 6);
		assertEquals(primeCount.primeCount(20, 22), 0);
		assertEquals(primeCount.primeCount(1, 1), 0);
		assertEquals(primeCount.primeCount(5, 5), 1);
		assertEquals(primeCount.primeCount(6, 2), 0);
		assertEquals(primeCount.primeCount(-10, 6), 3);
	}
}