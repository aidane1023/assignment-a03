package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {
    @Test
    void test_listContents1() {
        Solution34 app = new Solution34();
        List<String> list = new ArrayList<>();
        list.add("bucky");
        assertTrue(list.contains("bucky"), "Passed");
    }
    @Test
    void test_listContents2() {
        Solution34 app = new Solution34();
        List<String> list = new ArrayList<>();
        list.add("bucky");
        list.remove("bucky");
        assertFalse(list.contains("bucky"), "Failed");
    }
}