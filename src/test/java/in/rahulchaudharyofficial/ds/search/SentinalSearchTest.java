package in.rahulchaudharyofficial.ds.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SentinalSearchTest {

    @Test
    @DisplayName("ListSearch.search : Test search result model not null")
    void search_result_not_null() {
        Searchable<Integer> s = new SentinalSearch<>();
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
        SearchResult<Integer> model = s.search(input,11);
        assertNotNull(model);
    }

    @Test
    @DisplayName("ListSearch.search : Test search result do not found")
    void search_result_match_error() {
        Searchable<Integer> s = new SentinalSearch<>();
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
        SearchResult<Integer> model = s.search(input,11);
        assertTrue(model.getStatus() == ResponseStatus.ERROR);
        assertTrue(model.getPosition() == -1);
    }

    @Test
    @DisplayName("ListSearch.search : Test search result is found")
    void search_result_match_success() {
        Searchable<Integer> s = new SentinalSearch<>();
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
        SearchResult<Integer> model = s.search(input,5);
        assertTrue(model.getStatus() == ResponseStatus.SUCCESS);
        assertTrue(model.getPosition() == 4);
    }


    @Test
    void searchWithComplexObject() {
        List<Student> students = new ArrayList<> ();
        students.add(new Student(1,"Rahul Chaudhary",40));
        students.add(new Student(2,"Ruby Gupta",40));

        Student item = new Student(2,"Ruby Gupta",40);

        Searchable<Student> s = new SentinalSearch<>();
        SearchResult<Student> model = s.search(students, item);
        assertTrue(model.getStatus() == ResponseStatus.SUCCESS);
        assertTrue(model.getPosition() == 1);
    }

    @Test
    void search() {
        Searchable<Student> algo = new SentinalSearch<>();

        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Rahul Chaudhary",40));
        students.add(new Student(2,"Ruby Gupta",40));

        Student item = new Student(2,"Ruby Gupta",40);

        SearchResult<Student> s = algo.search(students, item);
        assertNotNull(s);
    }
}