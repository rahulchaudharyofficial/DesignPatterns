/**
 * 
 */
package in.rahulchaudharyofficial.ds.search;

import java.util.List;

/**
 * @author rahul
 *
 */
public class ProbabilitySearch<T> implements Searchable<T> {

	/**
	 * @implNote Locate the target in a list ordered by the probability of each
	 *           element being the target--most probable first, least probable last.
	 * @param input list of type T
	 * @param item that need to be searched in input list
	 * @return SearchResult
	 */
	
	@Override
	public SearchResult<T> search(List<T> input, T item) {
		SearchResult<T> result = new SearchResult<>();
		if(input.contains(item))
		{
			int index = input.indexOf(item);
			result.setModel(input.get(index));
			result.setPosition(index);
			result.setStatus(SearchStatus.SUCCESS);
		}
		return result;
	}
}
