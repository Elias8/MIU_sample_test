import com.miu_sample_test.PorcupineNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PorcupineNumberTest {

	@Test
	public void findPorcupineNumberTest() {
		PorcupineNumber porcupineNumber = new PorcupineNumber();

		assertEquals(139, porcupineNumber.findPorcupineNumber(0));
		assertEquals(139, porcupineNumber.findPorcupineNumber(138));
		assertEquals(409, porcupineNumber.findPorcupineNumber(139));
	}
}
