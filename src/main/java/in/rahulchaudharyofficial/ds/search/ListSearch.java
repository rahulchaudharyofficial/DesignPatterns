package in.rahulchaudharyofficial.ds.search;

import java.util.List;

public class ListSearch<T> implements Searchable<T> {

    @Override
    public SearchResultModel<T> search(List<T> input, T item) {
        SearchResultModel<T> model = new SearchResultModel<>();
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
        model.setStatus(isFound?ResponseStatus.SUCCESS:ResponseStatus.ERROR);
        model.setPosition(isFound?pos: -1);
        model.setModel(isFound?input.get(pos):null);
        return model;
    }
}