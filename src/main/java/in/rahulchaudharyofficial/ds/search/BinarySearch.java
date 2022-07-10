package in.rahulchaudharyofficial.ds.search;

import java.util.List;

/**
 * @param <T>
 */
public class BinarySearch<T extends Comparable<T>> implements Searchable<T> {

    /**
     * @param input is a sorted list of elements.
     * @param item
     * @return SearchResultModel
     */
    @Override
    public SearchResult<T> search(List<T> input, T item) {
        SearchResult<T> result = new SearchResult<>();

        if(input != null && !input.isEmpty() && item != null) {
            int mid = input.size()/2;
            if (item.compareTo(input.get(mid)) < 0) {
                return search(input.subList(0,mid),item);
            }
            else if(item.compareTo(input.get(mid)) > 0){
                return search(input.subList(mid+1,input.size()),item);
            }
            else {
                result.setPosition(mid);
                result.setModel(input.get(mid));
                result.setStatus(SearchStatus.SUCCESS);
            }
        }
        return result;
    }
}