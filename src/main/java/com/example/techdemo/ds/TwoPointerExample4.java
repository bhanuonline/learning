package com.example.techdemo.ds;

public class TwoPointerExample4 {
    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindrome = isPalindrome(str);
        System.out.println("Is palindrome: " + isPalindrome);
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
