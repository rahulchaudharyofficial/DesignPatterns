package in.rahulchaudharyofficial.ds.search;

import java.util.List;

public interface Searchable<T> {
    SearchResult<T> search(List<T> input, T item);
}
