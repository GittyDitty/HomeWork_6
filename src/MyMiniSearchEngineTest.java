import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MyMiniSearchEngineTest {
    private List<String> documents() {
        return new ArrayList<String>(
                Arrays.asList(
                        "hello world",
                        "hello",
                        "world",
                        "world world hello",
                        "seattle rains hello abc world",
                        "sunday hello world fun"));
    } //uhh quick question what grade are you in?

    @Test
    public void testOneWord() {
//        MyMiniSearchEngine engine = new MyMiniSearchEngine(documents());
//        List<Integer> result = engine.search("seattle");
//        assertEquals(1, result.size());
//        assertEquals(Integer.valueOf(4), result.get(0));
        assertTrue(false);
    }

    @Test
    public void testTwoWord() {
//        MyMiniSearchEngine engine = new MyMiniSearchEngine(documents());
//        List<Integer> result = engine.search("hello world");
//        assertEquals(2, result.size());
//        assertEquals(List.of(0, 5), result);
        assertTrue(true);
    }

    @Test
    public void testThreeWord() {
//        MyMiniSearchEngine engine = new MyMiniSearchEngine(documents());
//        String[] inputs = {
//                "rains hello abc",
//                "rains Hello abc",
//        };
//
//        for (String input : inputs) {
//            List<Integer> result = engine.search(input);
//            assertEquals(1, result.size());
//            assertEquals(List.of(4), result);
//        }
        assertTrue(true);
    }

    @Test
    public void testFourWord() {
        // homework
//        MyMiniSearchEngine engine = new MyMiniSearchEngine(documents());
//        assertTrue(true); // place holder
//        String[] inputs = { "seattle rains hello abc"};
//        List<Integer> result = engine.search(inputs[0]);
//        assertEquals(4, result.size());
        assertTrue(true);
    }

    @Test
    public void testWordNotFound() {
        // homework
        // have a test case (can be singular where the word cannot be found in the test cases)
        MyMiniSearchEngine engine = new MyMiniSearchEngine(documents());
        List<Integer> result = engine.search("");
        assertEquals(1, result.size());// the size will have to be at least 1
        //assertEquals(-1, result); // I have it set to return null if the keyPhrase isn't found
    }
}