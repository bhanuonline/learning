package com.example.techdemo.test;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={4,9,0,6,-1,5,23};
        int a[]={1,2,3,4,5};
       // sort(arr);
        //sort2(a);
        sort3(arr);

    }

    private static void sort3(int[] arr) {
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean flag=true;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!flag){
                break;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void sort2(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(!flag){
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void sort(int[] arr) {
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]> arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }
}
