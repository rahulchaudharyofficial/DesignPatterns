/**
 * 
 */
package in.rahulchaudharyofficial.ds.search;

import java.util.List;


/**
 * @author rahul
 *
 */
public class SeqSearch<T> implements Searchable<T> {

	@Override
	public SearchResult<T> search(List<T> input, T item) {
		SearchResult<T> result = new SearchResult<>();
		if(input.contains(item))
		{
			int index = input.indexOf(item);
			result.setPosition(index);
			result.setModel(input.get(index));
			result.setStatus(SearchStatus.SUCCESS);
		}
		return result;
	}
}
