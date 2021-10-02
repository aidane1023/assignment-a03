package baseline;

import org.junit.jupiter.api.Test;

import static baseline.paymentCalculator.calculateMonthsUntilPaidOff;
import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {

    @Test
    void test_calculatorFormation() {
        double expected = 70;
        double actual = calculateMonthsUntilPaidOff(5000, 12, 100);

        assertEquals(expected, actual, 0.00001);
    }

}