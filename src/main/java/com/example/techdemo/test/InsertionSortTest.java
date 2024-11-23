package com.example.techdemo.test;

public class InsertionSortTest {
    public static void main(String[] args) {
        int[] arr={34,65,98,77,32,11,22,11,0,9,-9,-5,3};
        is(arr);
    }

    private static void is(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int ce = arr[i];
            int j = i - 1;
            while (j >= 0 && ce < arr[j]) {
                arr[j+1] = arr[j];//
                j--;
            }
            arr[j+1] = ce;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
