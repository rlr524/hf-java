package com.robranf.sort_algos;

import java.util.Arrays;
import java.util.Random;

/*
Selection sort algorithms are fairly simple to implement but have a time complexity
of O(n^2) (quadratic) and should only be used for very simple sorting of small sets.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = new int[10000000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }
        System.out.println(Arrays.toString(numbers));
        long startTime = System.currentTimeMillis();
        selectionSort(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(numbers));
        System.out.printf("Took %d ms\n", endTime - startTime);
    }

    private static void selectionSort(int[] numbers) {
        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;
            for (int j = i + 1; j < length; j++ ) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i, indexOfMin);
        }
    }

    private static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}
