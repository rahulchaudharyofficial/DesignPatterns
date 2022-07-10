package in.rahulchaudharyofficial.ds.search;

import java.lang.reflect.Method;
import java.util.List;

public class SentinalSearch<T> implements Searchable<T> {

    private boolean validate(T item) {
        boolean isValid = false;
        for(Method m : item.getClass().getDeclaredMethods()) {
            if(m.getName()=="equals")
                isValid = true;
        }
        return isValid;
    }

    @Override
    public SearchResult<T> search(List<T> input, T item) {
        SearchResult<T> result = new SearchResult<>();

        if(input != null && !input.isEmpty() && item != null) {
            if(validate(item))
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
                    result.setStatus(ResponseStatus.SUCCESS);
                }
            }
            else
                throw new RuntimeException("Type <T> Must override equals and hashCode");
        }

        return result;
    }
}