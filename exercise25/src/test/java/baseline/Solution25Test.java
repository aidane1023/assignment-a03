package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void test_checkAlphabet1() {
        Solution25 app = new Solution25();
        boolean actual = app.checkAlphabet("abc");
        assertTrue(actual);
    }
    @Test
    void test_checkAlphabet2() {
        Solution25 app = new Solution25();
        boolean actual = app.checkAlphabet("123");
        assertFalse(actual);
    }

    @Test
    void test_checkNumbers1() {
        Solution25 app = new Solution25();
        boolean actual = app.checkNumbers("123");
        assertTrue(actual);
    }
    @Test
    void test_checkNumbers2() {
        Solution25 app = new Solution25();
        boolean actual = app.checkNumbers("abc");
        assertFalse(actual);
    }

    @Test
    void test_checkSymbol1() {
        Solution25 app = new Solution25();
        boolean actual = app.checkSymbols("abc!123");
        assertTrue(actual);
    }
    @Test
    void test_checkSymbol2() {
        Solution25 app = new Solution25();
        boolean actual = app.checkSymbols("abc123");
        assertFalse(actual);
    }
}