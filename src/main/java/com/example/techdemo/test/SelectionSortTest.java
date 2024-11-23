package com.example.techdemo.test;

public class SelectionSortTest {
    public static void main(String[] args) {
        int[] arr={5,98,90,23,-1,0,65,4,55};
        int[] a={1,2,3,4,5,6};
        selectionSort(a);

    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
