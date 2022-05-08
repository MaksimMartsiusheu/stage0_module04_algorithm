package com.epam.stage0.algorithm;

import com.epam.stage0.algorithm.utils.Complexity;

/**
 * Задачи на оценку сложности алгоритма
 * Ниже приведены соотношения констант с оценкой BigO
 *
 * Complexity.O_LOG_N       -> O(log N)
 * Complexity.O_N_2         -> O(log N^2)
 * Complexity.O_FACTORIAL_N -> 0(!N)
 * Complexity.O_2_N         -> 0(2*N)
 * Complexity.O_N_LOG_N     -> O(N * log N)
 * Complexity.O_1           -> O(1)
 * Complexity.O_N           -> O(N)
 */
public class AlgorithmComplexity {

    /**
     * Верните сложность линейного поиска,
     * если искомый елемент находится в конце массива
     */
    public Complexity badLinerSearch() {
        return Complexity.O_N;
    }

    /**
     * Верните сложность доступа к элементу массива по индексу
     */
    public Complexity arrayIndexItemAccess() {
        return Complexity.O_1;
    }

    /**
     * Верните сложность бинарного поиска
     */
    public Complexity binarySorting() {
        return Complexity.O_LOG_N;
    }

    /**
     * Верните сложность алгноритма twoCycleSorting
     */
    public Complexity twoCycleSorting() {
        return Complexity.O_N_2;
    }

}
