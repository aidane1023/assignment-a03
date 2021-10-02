package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void test_isAnagram() {
        Solution24 app = new Solution24();

        String expected  = "test and fails are not anagrams.";
        String actual = app.isAnagram("test", "fails");

        assertEquals(expected, actual);
    }

    @Test
    void test_sortString1() {
        Solution24 app = new Solution24();

        String expected  = "test and fail are not anagrams.";
        String actual = app.sortString("test", "fail", 4);

        assertEquals(expected, actual);
    }
    @Test
    void test_sortString2() {
        Solution24 app = new Solution24();

        String expected  = "team and meat are anagrams.";
        String actual = app.sortString("team", "meat", 4);

        assertEquals(expected, actual);
    }

}