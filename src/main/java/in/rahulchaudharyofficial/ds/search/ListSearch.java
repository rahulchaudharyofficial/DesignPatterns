package in.rahulchaudharyofficial.ds.search;

import java.util.List;

public class ListSearch<T> implements Searchable<T> {

    @Override
    public SearchResult<T> search(List<T> input, T item) {
        SearchResult<T> model = new SearchResult<>();
        Boolean isFound = Boolean.FALSE;
        int pos = -1;
        if(input != null && !input.isEmpty() && item != null)
        {
            for(T element : input)
            {
                if (element.equals(item)) {
                    isFound = Boolean.TRUE;
                    pos++;
                    break;
                }
                else {
                    pos ++;
                }
            }
        }
        model.setStatus(isFound?SearchStatus.SUCCESS:SearchStatus.ERROR);
        model.setPosition(isFound?pos: -1);
        model.setModel(isFound?input.get(pos):null);
        return model;
    }
}