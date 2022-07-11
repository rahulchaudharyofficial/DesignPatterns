/**
 * 
 */
package in.rahulchaudharyofficial.ds.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author rahul
 *
 */
class HasherTest {

	/**
	 * Test method for {@link in.rahulchaudharyofficial.ds.search.Hasher#hash(java.lang.String, int, int, int)}.
	 */
	@Test
	void testHash() {
		int hash = Hasher.hash("Rahul Chaudhary", 15, 8, 2);
		assertNotNull(hash);
		System.out.println("hash = "+ hash);
	}

}
