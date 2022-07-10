package in.rahulchaudharyofficial.ds.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    @DisplayName("ListSearch.search : Test search result model not null")
    void search_result_not_null() {
        Searchable<Integer> s = new BinarySearch<>();
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
        SearchResult<Integer> model = s.search(input,11);
        assertNotNull(model);
    }

    @Test
    @DisplayName("ListSearch.search : Test search result do not found")
    void search_result_match_error() {
        Searchable<Integer> s = new BinarySearch<>();
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
        SearchResult<Integer> model = s.search(input,11);
        assertTrue(model.getStatus() == SearchStatus.ERROR);
        assertTrue(model.getPosition() == -1);
    }

    @Test
    @DisplayName("ListSearch.search : Test search result is found")
    void search_result_match_success() {
        Searchable<Integer> s = new ListSearch<>();
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
        SearchResult<Integer> model = s.search(input,5);
        assertTrue(model.getStatus() == SearchStatus.SUCCESS);
        assertTrue(model.getPosition() == 4);
    }


    @Test
    void searchWithComplexObject() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10,"Sarita",40));
        students.add(new Student(1,"Rahul Chaudhary",40));
        students.add(new Student(2,"Ruby Gupta",40));
        students.add(new Student(3,"Devika Srivastava",40));
        students.add(new Student(4,"Aman Gupta",40));

        Collections.sort(students);

        Student item = new Student(2,"Ruby Gupta",40);

        Searchable<Student> s = new BinarySearch<>();
        SearchResult<Student> model = s.search(students, item);
        assertTrue(model.getStatus() == SearchStatus.SUCCESS);
        assertTrue(model.getPosition() == 1);
        assert(item.compareTo(model.getModel()) == 0);
    }

    @Test
    void searchWithNonComparableEntity() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(10,"Sarita",40));
        personList.add(new Person(1,"Rahul Chaudhary", 10));
        personList.add(new Person(2,"Ruby Gupta",40));
        personList.add(new Person(3,"Devika Srivastava",40));
        personList.add(new Person(4,"Aman Gupta",40));


        Person item = new Person(2,"Ruby Gupta",40);

        Searchable<Person> search = new ListSearch<>();

        SearchResult<Person> result = search.search(personList, item);

        assertTrue(result.getStatus() == SearchStatus.SUCCESS);
    }
}