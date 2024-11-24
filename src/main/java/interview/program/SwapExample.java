package interview.program;
//Java does not support "pass-by-reference
public class SwapExample {
    public static void swapValues(int[] arr) {
        if (arr == null || arr.length != 2) {
            throw new IllegalArgumentException("Array must have exactly 2 elements.");
        }
        
        // Swap values
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        int[] values = {5, 10};
        System.out.println("Before swap: " + java.util.Arrays.toString(values));

        // Call the swap function
        swapValues(values);

        System.out.println("After swap: " + java.util.Arrays.toString(values));
    }
}
