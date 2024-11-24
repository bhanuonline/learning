package interview.program;

import java.util.Arrays;
public class ZywOo {
  public static int[] take(int[] arr, int n) {
     return Arrays.stream(arr).limit(n).toArray();
  }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(take(arr, 4)));
    }
}