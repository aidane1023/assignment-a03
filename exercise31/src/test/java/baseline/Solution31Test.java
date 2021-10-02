package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void test_calcTargetHeartRate() {
        double expectedTargetHeartRate = 191;
        double actualTargetHeartRate = Math.round((((220 - 22) - 65) * .95) + 65);

        assertEquals(expectedTargetHeartRate, actualTargetHeartRate, 0.000001);
    }

}