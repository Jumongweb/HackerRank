import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTest {

    @Test
    public void testThatFunctionCanDivide(){
        int numerator = 10;
        int denominator = 2;
        assertEquals(5, ExceptionHandling.divide(numerator, denominator));
    }

    @Test
    public void testThatFunctionCannotDivideByZero(){
        int numerator = 10;
        int denominator = 0;
        assertThrows(ArithmeticException.class, () -> ExceptionHandling.divide(numerator, denominator));
    }

    @Test
    public void testThatFunctionCannotDivideByString(){
        int numerator = 10;
        String denominator = "Hello";
        assertThrows(NumberFormatException.class, () -> ExceptionHandling.divide(numerator, Integer.parseInt(denominator)));
    }
}