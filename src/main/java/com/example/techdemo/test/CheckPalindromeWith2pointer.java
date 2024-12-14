package com.example.techdemo.test;

public class CheckPalindromeWith2pointer {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false; // Null or empty strings are not palindromes
        }

        int left = 0, right = str.length() - 1;

        while (left < right) {
            // Compare characters at left and right pointers
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }

    public static boolean isPalindromeIgnoreCase(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        int left = 0, right = str.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            // Compare case-insensitively
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
