public class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisorSum(int n) {
        int total = 0;
        for (int count = 1; count <= n; count++){
            if (n % count == 0){
                total += count;
            }
        }
        return total;
    }
}
