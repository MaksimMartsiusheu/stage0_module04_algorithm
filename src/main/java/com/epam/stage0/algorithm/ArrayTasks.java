package com.epam.stage0.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ArrayTasks {

    //
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    //
    public int[] generateNumbers(int length) {
        return IntStream.range(0, length)
                .map(i -> i + 1)
                .toArray();
    }

    //
    public int totalSum(int[] arr) {
        return Arrays.stream(arr)
                .sum();
    }

    //
    public int findIndexOfNumber(int[] arr, int number) {
        return IntStream.range(0, arr.length).filter(i -> arr[i] == number).findFirst().orElse(-1);
    }

    //
    public int[] getOnlyPositiveNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(i -> i > 0)
                .toArray();
    }

    //
    public String[] reverseArray(String[] arr) {
        return IntStream.rangeClosed(1, arr.length)
                .mapToObj(i -> arr[arr.length - i])
                .toArray(String[]::new);
    }

    //
    public int[][] sortRaggedArray(int[][] arr) {
        return Arrays.stream(arr)
                .sorted(Comparator.comparingInt(array -> array.length))
                .peek(Arrays::sort)
                .toArray(int[][]::new);
    }
}
