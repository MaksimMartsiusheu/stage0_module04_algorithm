package com.epam.stage0.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * Здесь собраны задачи по работе с массивами
 *
 * Заприщено пользовать любимы допольнительными пакета, таками как java.util.*
 */
public class ArrayTasks {

    /**
     * Верните массив String[], в котором будут перечислены все поры года начиная с зимы
     */
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Сгенирируйте массив int[] последовательных положительных целых чисел
     * начиная с 1 заданной длины (параметр length > 0)
     *
     * Пример:
     *
     * length=1  -> [1]
     * length=3  -> [1, 2, 3]
     * length=5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        return IntStream.range(0, length)
                .map(i -> i + 1)
                .toArray();
    }

    /**
     * Найдите сумму всех элементов массива int[]
     *
     * Пример:
     *
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        return Arrays.stream(arr)
                .sum();
    }

    /**
     * Верните индекс первого вхождения number в массив arr.
     * Если такого элемента в массиве нет - верните -1
     *
     * Пример:
     *
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        return IntStream.range(0, arr.length).filter(i -> arr[i] == number).findFirst().orElse(-1);
    }

    /**
     *  Верните новый массив String[], полученный из массива arr,
     *  путём смены порядка элементов на обратный
     *
     *  Пример:
     *
     *  arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     *  arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        return IntStream.rangeClosed(1, arr.length)
                .mapToObj(i -> arr[arr.length - i])
                .toArray(String[]::new);
    }

    /**
     * Верните новый массив int[], полученный из массива int[] arr
     * путём выбора лишь положительных чисел.
     * P.S. 0 - не положительное число).
     *
     * Привер:
     *
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(i -> i > 0)
                .toArray();
    }

    /**
     * Верните отсуртированный рванный двумерный массив int[][] следующим образом:
     * Входящие одномерные массивы должны располагаться по возрастению их длинны;
     * числа во всех одномерных массивах должны располагаться по возрастанию
     *
     * Пример:
     *
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        return Arrays.stream(arr)
                .sorted(Comparator.comparingInt(array -> array.length))
                .peek(Arrays::sort)
                .toArray(int[][]::new);
    }
}
