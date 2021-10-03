package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {
    @Test
    void test_totalLetters1() {
        Solution37 app = new Solution37();
        int expected = 4;
        int actual = app.getTotalLetters(8, 2,2);

        assertEquals(expected, actual, 0.0001);
    }
    @Test
    void test_totalLetters2() {
        Solution37 app = new Solution37();
        int expected = 10;
        int actual = app.getTotalLetters(15, 3,2);

        assertEquals(expected, actual, 0.0001);
    }
}