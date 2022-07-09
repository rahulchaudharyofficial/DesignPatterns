package in.rahulchaudharyofficial.ds.search;

import java.util.List;

/**
 * @param <T>
 */
public class BinarySearch<T extends Comparable> implements Searchable<T> {

    /**
     * @param input is a sorted list of elements.
     * @param item
     * @return
     */
    @Override
    public SearchResultModel<T> search(List<T> input, T item) {
        SearchResultModel<T> result = new SearchResultModel<>();

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
                result.setStatus(ResponseStatus.SUCCESS);
            }
        }
        return result;
    }
}