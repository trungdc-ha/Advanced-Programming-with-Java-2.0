package _09_automated_testing_tdd.triangle_type;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class TriangleTypeTest {
    @Test
    @DisplayName("Testing case1")
    public void testCase1() {
        int a = 2, b = 2, c = 2;
        String expected = "Tam giac deu";
        String result = TriangleType.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing case2")
    public void testCase2() {
        int a = 2, b = 2, c = 3;
        String expected = "Tam giac can";
        String result = TriangleType.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing case3")
    public void testCase3() {
        int a = 2, b = 4, c = 5;
        String expected = "Tam giac thuong";
        String result = TriangleType.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing case4")
    public void testCase4() {
        int a = 8, b = 2, c = 3;
        String expected = "khong phai tam giac";
        String result = TriangleType.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }
}
