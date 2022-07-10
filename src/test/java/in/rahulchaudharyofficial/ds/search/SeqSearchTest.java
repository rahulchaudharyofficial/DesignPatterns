/**
 * 
 */
package in.rahulchaudharyofficial.ds.search;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import in.rahulchaudharyofficial.utils.Utils;

/**
 * @author rahul
 *
 */
class SeqSearchTest {
	
	private Utils<Integer> utils = new Utils<>();
	private Searchable<Integer> search = new SeqSearch<>();
	/**
	 * Test method for {@link in.rahulchaudharyofficial.ds.search.SeqSearch#search(java.util.List, java.lang.Object)}.
	 */
	@Test
	void testSearch() {
		List<Integer> input = utils.getRandomArrayBySize(20);
		SearchResult<Integer> result = search.search(input, 10);
		assertNotNull(result);
	}

}
