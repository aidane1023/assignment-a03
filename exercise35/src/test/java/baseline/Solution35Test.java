package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {
    @Test
    void test_numberPicker() {
        Solution35 app = new Solution35();
        int random = app.randomNumberGenerator(3);
        int high = 3;
        int low = 0;
        assertTrue(high >= random, "Error, random is too high");
        assertTrue(low  <= random, "Error, random is too low");
    }

}