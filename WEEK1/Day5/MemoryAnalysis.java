package WEEK1.Day5;

import java.util.*;

public class MemoryAnalysis {
    public static void main(String[] args) {
        
        Runtime runtime = Runtime.getRuntime();

        // Show initial memory usage
        System.out.println("Initial Free Memory: " + runtime.freeMemory());

        // Create a list to store data
        List<String> list = new ArrayList<>();

        // Add data (simulate memory usage)
        for (int i = 0; i < 100000; i++) {
            list.add("Data-" + i);
        }
        System.out.println("After Adding Data, Free Memory: " + runtime.freeMemory());

        // Remove data
          // suggest Garbage Collection
        list.clear();
        System.gc();
        System.out.println("After Removing Data + GC, Free Memory: " + runtime.freeMemory());
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Max Memory: " + runtime.maxMemory());
    }
}
