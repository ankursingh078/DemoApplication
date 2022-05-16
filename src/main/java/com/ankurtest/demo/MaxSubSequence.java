package com.ankurtest.demo;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxSequence(arr, n);
        sc.close();
    }

    private static void maxSequence(int[] arr, int n) {
        int i, c = 0, j = 0;
        Arrays.sort(arr);
        for (i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                if (i - j > c)
                    c = i - j;
                j = i;
            }
        }
        if (i - j > c)
            c = i - j;
        System.out.println(c);
    }
}
