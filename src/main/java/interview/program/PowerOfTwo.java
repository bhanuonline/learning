package interview.program;


public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOf2(1026));
        System.out.println(Long.bitCount(1024));;
    }

    private static boolean isPowerOf2(int n) {
        if (n ==1) {
            return true;
        }
        if (n <= 0 || n % 2 != 0) {
            return false;
        }
        return isPowerOf2(n/2);

    }
    private static boolean iSPowerOf2(int n) {
        return (n > 0) && (n & (n - 1)) == 0;
    }
}
