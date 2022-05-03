package com.company;

/*Input: N = 6, M = 5
A[] = {1, 2, 3, 4, 5, 10}
B[] = {2, 3, 1, 0, 5}
Output: 4 10
Explanation: 4 and 10 are present in
first array, but not in second array.*/


import java.util.Arrays;
import java.util.HashSet;

public class missinginarr {
    public static void main(String[] args) {
        int[] arr1={1, 2, 3, 4, 5, 10};
        int[] arr2={2, 3, 1, 0, 5};
        HashSet<Integer> hs=new HashSet<>();
        for (int k : arr2) {
            hs.add(k);
        }
        for (int i : arr1) {
            if (!hs.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
