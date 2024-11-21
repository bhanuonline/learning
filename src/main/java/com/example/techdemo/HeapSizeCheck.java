package com.example.techdemo;

public class HeapSizeCheck {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // Total heap size allocated to JVM
        long totalMemory = runtime.totalMemory();
        // Maximum heap size JVM can use
        long maxMemory = runtime.maxMemory();
        // Free memory available in the heap
        long freeMemory = runtime.freeMemory();

        System.out.println("Total Memory: " + (totalMemory / (1024 * 1024)) + " MB");
        System.out.println("Max Memory: " + (maxMemory / (1024 * 1024)) + " MB");
        System.out.println("Free Memory: " + (freeMemory / (1024 * 1024)) + " MB");
    }
}
