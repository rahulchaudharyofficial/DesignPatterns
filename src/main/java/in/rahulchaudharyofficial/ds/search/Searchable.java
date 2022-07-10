package in.rahulchaudharyofficial.ds.search;

import java.util.List;

public interface Searchable<T> {
    SearchResultModel<T> search(List<T> input, T item);
}
