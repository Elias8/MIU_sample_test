import com.miu_sample_test.InertialArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InertialArrayTest {

	@Test
	public void isInertialTest() {
		int[] array1 = {1};
		int[] array2 = {2};
		int[] array3 = {1, 2, 3, 4};
		int[] array4 = {1, 1, 1, 1, 1, 1, 2};
		int[] array5 = {2, 12, 4, 6, 8, 11};
		int[] array6 = {2, 12, 12, 4, 6, 8, 11};
		int[] array7 = {-2, -4, -6, -8, -11};
		int[] array8 = {2, 3, 5, 7};
		int[] array9 = {2, 4, 6, 8, 10};

		InertialArray inertialArray = new InertialArray();

		assertEquals(inertialArray.isInertial(array1), 0);
		assertEquals(inertialArray.isInertial(array2), 0);
		assertEquals(inertialArray.isInertial(array3), 0);
		assertEquals(inertialArray.isInertial(array4), 1);
		assertEquals(inertialArray.isInertial(array5), 1);
		assertEquals(inertialArray.isInertial(array6), 1);
		assertEquals(inertialArray.isInertial(array7), 0);
		assertEquals(inertialArray.isInertial(array8), 0);
		assertEquals(inertialArray.isInertial(array9), 0);
	}
}
