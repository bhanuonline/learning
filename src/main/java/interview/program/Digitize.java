package interview.program;

import java.util.Arrays;

public class Digitize {
    public static void main(String[] args) {
        int i=123;
        String s = String.valueOf(i);
        int[] arr=new int[s.length()];

        for (int j = 0; j < s.length(); j++) {
            arr[j]=s.charAt(j)-48;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
        Integer.toString(i).chars().map(c->c-'0').toArray();

        // Convert number to a String and split into a String array
        String[] digits = String.valueOf(i).split("");

        // Print the array
        System.out.println(Arrays.toString(digits));
    }
}
