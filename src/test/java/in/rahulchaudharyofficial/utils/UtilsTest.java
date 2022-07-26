/**
 * 
 */
package in.rahulchaudharyofficial.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author rahul
 *
 */
class UtilsTest {

	/**
	 * Test method for {@link in.rahulchaudharyofficial.utils.Utils#sum(int[])}.
	 */
	@Test
	void testSum() {
		int result = Utils.sum(1,2,3,4,5,6,7,8,9,10);
		assertTrue(result == 55);
	}

}
