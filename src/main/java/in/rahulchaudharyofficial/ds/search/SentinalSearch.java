package in.rahulchaudharyofficial.ds.search;

import java.util.List;
import in.rahulchaudharyofficial.utils.Utils;

public class SentinalSearch<T> implements Searchable<T> {

    @Override
    public SearchResult<T> search(List<T> input, T item) {
        SearchResult<T> result = new SearchResult<>();

        if(input != null && !input.isEmpty() && item != null) {
        	Utils<T> utils = new Utils<>();
            if(utils.doesImplementEquals(item))
            {
                int index = 0;
                while(index < input.size() && !item.equals(input.get(index)))
                {
                    index++;
                }
                if(index < input.size() && item.equals(input.get(index)))
                {
                    result.setPosition(index);
                    result.setModel(input.get(index));
                    result.setStatus(SearchStatus.SUCCESS);
                }
            }
            else
                throw new RuntimeException("Type <T> Must override equals and hashCode");
        }

        return result;
    }
}