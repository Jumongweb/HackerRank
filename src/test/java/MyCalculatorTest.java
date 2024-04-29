import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyCalculatorTest {
    @Test
    public void testAdd(){
        MyCalculator myCalculator = new MyCalculator();
        assertEquals(12, myCalculator.divisorSum(6));
    }
        @Test
    public void testSumOfDivisorsOf12Is(){
        MyCalculator myCalculator = new MyCalculator();
        assertEquals(28, myCalculator.divisorSum(12));
    }

}