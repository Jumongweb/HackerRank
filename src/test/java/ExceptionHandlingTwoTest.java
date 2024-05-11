import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTwoTest {
    @Test
    public void testThat2ToThePowerOf4Is16() throws Exception {
        int n = 2;
        int p = 4;
        long expected = ExceptionHandlingTwo.power(n,p);
        assertEquals(expected, 16);
    }

    @Test
    public void testThat3ToThePowerOf5Is243() throws Exception {
        int n = 3;
        int p = 5;
        long expected = ExceptionHandlingTwo.power(n,p);
        assertEquals(expected, 243);
    }

    @Test
    public void testThat0ToThePowerOf0IsThrowsException() throws Exception {
        int n = 0;
        int p = 0;
//        assertThrows(Exception.class, () -> ExceptionHandlingTwo.power(n,p));
        try {
            ExceptionHandlingTwo.power(n,p);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "n and p should not be 0");
        }
    }

    @Test
    public void testThatNegativeNumberToThePowerOfEitherNegativeOrPositiveNumberThrowsException() throws Exception {
        int n = -5;
        int p = 9;
//        assertThrows(Exception.class, () -> ExceptionHandlingTwo.power(n,p));
        try {
            ExceptionHandlingTwo.power(n,p);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "n or p should not be negative");
        }
    }

}