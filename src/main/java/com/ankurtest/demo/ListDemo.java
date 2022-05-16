/*
package com.ankurtest.demo;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }
        int res = missingNumber(arr, n);
        System.out.println("Missing Number: " + res);
        sc.close();
    }

    private static int missingNumber(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            sum += arr[i];
        }
        Set<Integer> set = new HashSet<>();
        return (n*(n+1)/2 - sum);
    }
}
*/
