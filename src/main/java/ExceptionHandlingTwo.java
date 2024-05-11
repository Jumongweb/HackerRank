public class ExceptionHandlingTwo {
    public static long power(int n, int p) throws Exception {
            if (n == 0 && p == 0){
                throw new Exception("n and p should not be 0");
            }
            if (n < 0 || p < 0){
                throw new Exception("n or p should not be negative");
            }
            long result = 1;
            for (int i = 0; i < p; i++){
                result *= n;
            }
            return result;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(power(2,4));
    }
}
