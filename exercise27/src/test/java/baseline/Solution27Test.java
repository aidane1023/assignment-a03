package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void test_validName1() {
        Solution27 app = new Solution27();
        String expected = "";
        String actual = app.validateName("Bob", "first");

        assertEquals(expected, actual);
    }
    @Test
    void test_validName2() {
        Solution27 app = new Solution27();
        String expected = "The first name must be at least two characters long.\n";
        String actual = app.validateName("", "first");

        assertEquals(expected, actual);
    }

    @Test
    void test_validID1() {
        Solution27 app = new Solution27();
        String expected = "The employee ID must be in the format of AA-1234.\n";
        String actual = app.validateID("ABC-123");

        assertEquals(expected, actual);
    }
    @Test
    void test_validID2() {
        Solution27 app = new Solution27();
        String expected = "";
        String actual = app.validateID("AA-1234");

        assertEquals(expected, actual);
    }

    @Test
    void test_validZip1() {
        Solution27 app = new Solution27();
        String expected = "";
        String actual = app.validateZip("33333");

        assertEquals(expected, actual);
    }
    @Test
    void test_validZip2() {
        Solution27 app = new Solution27();
        String expected = "The zipcode must be a 5 digit number.\n";
        String actual = app.validateZip("33");

        assertEquals(expected, actual);
    }
    @Test
    void test_validZip3() {
        Solution27 app = new Solution27();
        String expected = "The zipcode must be a 5 digit number.\n";
        String actual = app.validateZip("a");

        assertEquals(expected, actual);
    }
}