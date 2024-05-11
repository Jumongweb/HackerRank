public class ExceptionHandling {
    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return x / y;
    }
}
