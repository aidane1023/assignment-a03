package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {
    @Test
    void test_numberPicker() {
        Solution33 app = new Solution33();
        int random = app.numberPicker();
        int high = 3;
        int low = 0;
        assertTrue(high >= random, "Error, random is too high");
        assertTrue(low  <= random, "Error, random is too low");
    }
}