package com.pvelychko.arrays;

import com.sun.tools.javac.util.Assert;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Rotate an array to the right by a given number of steps.
 *
 * A zero-indexed array A consisting of N integers is given. Rotation of the array means
 * that each element is shifted right by one index, and the last element of the array is also
 * moved to the first place.
 *
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate
 * array A K times; that is, each element of A will be shifted to the right by K indexes.
 *
 * Write a function:
 *
 * class Solution { public int[] solution(int[] A, int K); }
 *
 * that, given a zero-indexed array A consisting of N integers and an integer K, returns
 * the array A rotated K times.
 *
 * For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
 *
 * Assume that:
 *
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 *
 * In your solution, focus on correctness. The performance of your solution will not
 * be the focus of the assessment.
 *
 * Created by pvelychko on 17/02/16.
 */
public final class CyclicRotation {

    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();

        Assert.check(Arrays.equals(cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 1), new int[]{6, 3, 8, 9, 7}));
        Assert.check(Arrays.equals(cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3), new int[]{9, 7, 6, 3, 8}));
    }

    public int[] solution(int[] A, int K) {
        int[] rotatedArray = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            rotatedArray[i + K > (A.length - 1) ? (i + K - A.length) : i + K] = A[i];
        }

        return rotatedArray;
    }

}
