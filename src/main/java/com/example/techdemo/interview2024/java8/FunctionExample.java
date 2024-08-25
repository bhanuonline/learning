package com.example.techdemo.interview2024.java8;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();
        
        System.out.println(stringLength.apply("Hello"));
    }
}
