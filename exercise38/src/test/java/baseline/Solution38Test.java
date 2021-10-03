package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {
    @Test
    void test_isEven() {
        assertTrue( (3 & 1) != 0 );
        assertFalse((2 & 1) != 0);
    }
}