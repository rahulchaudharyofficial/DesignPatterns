/**
 * 
 */
package in.rahulchaudharyofficial.ds.search;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author rahul
 *
 */
class ProbabilitySearchTest {

	/**
	 * Test method for {@link in.rahulchaudharyofficial.ds.search.ProbabilitySearch#search(java.util.List, java.lang.Object)}.
	 */
	@Test
    @DisplayName("ListSearch.search : Test search result model not null")
    void search_result_not_null() {
        Searchable<Integer> s = new ProbabilitySearch<>();
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
        SearchResult<Integer> model = s.search(input,11);
        assertNotNull(model);
    }

    @Test
    @DisplayName("ListSearch.search : Test search result do not found")
    void search_result_match_error() {
        Searchable<Integer> s = new ProbabilitySearch<>();
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
        SearchResult<Integer> model = s.search(input,11);
        assertTrue(model.getStatus() == SearchStatus.ERROR);
        assertTrue(model.getPosition() == -1);
    }

    @Test
    @DisplayName("ListSearch.search : Test search result is found")
    void search_result_match_success() {
        Searchable<Integer> s = new ProbabilitySearch<>();
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
        SearchResult<Integer> model = s.search(input,5);
        assertTrue(model.getStatus() == SearchStatus.SUCCESS);
        assertTrue(model.getPosition() == 4);
    }


    @Test
    void searchWithComplexObject() {
        List<Student> students = new ArrayList<> ();
        students.add(new Student(1,"Rahul Chaudhary",40));
        students.add(new Student(2,"Ruby Gupta",40));

        Student item = new Student(2,"Ruby Gupta",40);

        Searchable<Student> s = new ProbabilitySearch<>();
        SearchResult<Student> model = s.search(students, item);
        assertTrue(model.getStatus() == SearchStatus.SUCCESS);
        assertTrue(model.getPosition() == 1);
    }

    @Test
    void search() {
        Searchable<Student> algo = new ProbabilitySearch<>();

        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Rahul Chaudhary",40));
        students.add(new Student(2,"Ruby Gupta",40));

        Student item = new Student(2,"Ruby Gupta",40);

        SearchResult<Student> s = algo.search(students, item);
        assertNotNull(s);
    }
}
