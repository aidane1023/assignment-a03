package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    @Test
    void test_average() {
        Solution36 app = new Solution36();
        int sum = (1 + 2 + 3);
        double average = sum / 3;
        double expected = 2;
        double actual = average;

        assertEquals(expected, actual, 0.00001);
    }

}