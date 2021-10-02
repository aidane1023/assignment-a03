package baseline;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void test_calcArraySum() {
        Solution28 app = new Solution28();
        double[] arr = {1,2,3,4,5};

        double expected = 15;
        double actual = app.calcArraySum(arr);

        assertEquals(expected, actual, 0.0001);
    }
}