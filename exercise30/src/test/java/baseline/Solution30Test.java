package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {
    @Test
    void test_Result() {
        Solution30 app = new Solution30();
        int expected = 144;
        int actual = app.printTableLoop();

        assertEquals(expected, actual, 0.00001);
    }

}