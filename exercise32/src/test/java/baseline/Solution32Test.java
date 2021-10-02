package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {
    @Test
    void test_numberPicker1() {
        Solution32 app = new Solution32();
        int random = app.numberPicker(1);
        int high = 10;
        int low = 1;
        assertTrue(high >= random, "Error, random is too high");
        assertTrue(low  <= random, "Error, random is too low");
    }
    @Test
    void test_numberPicker2() {
        Solution32 app = new Solution32();
        int random = app.numberPicker(2);
        int high = 100;
        int low = 1;
        assertTrue(high >= random, "Error, random is too high");
        assertTrue(low  <= random, "Error, random is too low");
    }
    @Test
    void test_numberPicker3() {
        Solution32 app = new Solution32();
        int random = app.numberPicker(3);
        int high = 1000;
        int low = 1;
        assertTrue(high >= random, "Error, random is too high");
        assertTrue(low  <= random, "Error, random is too low");
    }
}