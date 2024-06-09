package com.example.techdemo.ds;

public class TwoPointerExample2 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(array);
        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int removeDuplicates(int[] array) {
        if (array.length == 0) return 0;

        int uniquePos = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[uniquePos]) {
                uniquePos++;
                array[uniquePos] = array[i];
            }
        }
        return uniquePos + 1;
    }
}
