package com.example.techdemo.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointerExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 1, 5, 6};
        int target = 6;
        List<int[]> pairs = findAllPairsWithSum(array, target);
        if (!pairs.isEmpty()) {
            for (int[] pair : pairs) {
                System.out.println("Pair found: (" + pair[0] + ", " + pair[1] + ")");
            }
        } else {
            System.out.println("No pairs found.");
        }
    }

    public static List<int[]> findAllPairsWithSum(int[] array, int target) {
        List<int[]> result = new ArrayList<>();
        // Sort the array if it's not sorted
        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                result.add(new int[]{array[left], array[right]});
                left++;
                right--;
                // Avoid duplicates
                while (left < right && array[left] == array[left - 1]) left++;
                while (left < right && array[right] == array[right + 1]) right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
