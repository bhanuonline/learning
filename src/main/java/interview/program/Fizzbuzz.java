package interview.program;



/*
Return an array containing the numbers from 1 to N, where N is the parametered value.

Replace certain values however if any of the following conditions are met:

If the value is a multiple of 3: use the value "Fizz" instead
If the value is a multiple of 5: use the value "Buzz" instead
If the value is a multiple of 3 & 5: use the value "FizzBuzz" instead
N will never be less than 1.
*/

import java.util.Arrays;

public class Fizzbuzz {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //System.out.println(Arrays.toString(fizzbuzz(arr,15)));

        System.out.println(Arrays.toString(fizzbuzz(arr)));
    }

    private static String[] fizzbuzz(int[] arr, int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            if(arr[i]%3 == 0 && arr[i]%5 == 0) {
                result[i]="FizzBuzz";
            }else if(arr[i]%3 == 0) {
                result[i]="Fizz";
            }else if(arr[i]%5 == 0) {
                result[i]="Buzz";
            }
            else {
                result[i]=arr[i]+"";
            }
        }

        return result;
    }

    private static String[] fizzbuzz(int[] arr) {
        return Arrays.stream(arr) // Create a stream from the array
                .mapToObj(x -> {
                    if (x % 3 == 0 && x % 5 == 0) {
                        return "FizzBuzz";
                    } else if (x % 3 == 0) {
                        return "Fizz";
                    } else if (x % 5 == 0) {
                        return "Buzz";
                    } else {
                        return String.valueOf(x); // Convert number to String
                    }
                })
                .toArray(String[]::new); // Collect the result into a new String array
    }
}
