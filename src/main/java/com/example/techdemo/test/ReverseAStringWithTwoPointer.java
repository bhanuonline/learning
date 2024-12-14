package com.example.techdemo.test;

public class ReverseAStringWithTwoPointer {
    public static void main(String[] args) {
        String s="hello";

        char[] c=s.toCharArray();
        int l=0; int r=s.length()-1;
        while(l<r) {
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;
        }
        System.out.println(c);
    }
}
