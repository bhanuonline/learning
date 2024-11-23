package com.example.techdemo.test;

public class MergeSortTest {
    public static void main(String[] args) {
        int[] arr={76,98,3,5,66,0,-9,-1};
        mergesort(0,arr.length,arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void mergesort(int l, int r, int[] arr) {
        if(l<r){
            int m=(l+r)/2;
            mergesort(l,m,arr);
            mergesort(m+1,r,arr);
            merge(l,r,m,arr);
        }
    }

    private static void merge(int l, int r, int m, int[] arr) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                l++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
        }
        while (i < n1) {
            arr[k] = R[j];
            l++;
            k++;
        }
        while (j < n2) {
            arr[k] = L[j];
            j++;
            k++;
        }
    }
}
