package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void test_calcTime(){
        Solution29 app = new Solution29();

        double expected = 8;
        double actual = app.calcTime(9);

        assertEquals(expected, actual, 0.000001);
    }

}