package _09_automated_testing_tdd.next_day;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {

    @Test
    @DisplayName("Testing case1")
    public void testCase1() {
        String input = "01/01/2018";
        String expected = "02/01/2018";

        String result = NextDayCalculator.nextDay(input);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing case2")
    public void testCase2() {
        String input = "30/01/2018";
        String expected = "31/01/2018";

        String result = NextDayCalculator.nextDay(input);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing case3")
    public void testCase3() {
        String input = "31/01/2018";
        String expected = "01/02/2018";

        String result = NextDayCalculator.nextDay(input);
        assertEquals(expected, result);
    }

}
