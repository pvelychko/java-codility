package com.pvelychko.timecomplexity;

import com.sun.tools.javac.util.Assert;

/**
 * Find the missing element in a given permutation.
 *
 * A zero-indexed array A consisting of N different integers is given. The array contains
 * integers in the range [1..(N + 1)], which means that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a zero-indexed array A, returns the value of the missing element.
 *
 * For example, given array A such that:
 *
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 *
 * the function should return 4, as it is the missing element.
 *
 * Assume that:
 *
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 *
 * Complexity:
 *
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1), beyond input storage (not counting
 * the storage required for input arguments).
 *
 * Elements of input arrays can be modified.
 *
 * Created by pvelychko on 17/02/16.
 */
public final class PermMissingElem {

    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();

        Assert.check(permMissingElem.solution(new int[]{2, 3, 1, 5}) == 4);
    }

    public int solution(int[] A) {
        return calculatedSum(A.length) - calculatedSum(A.length - 1);
    }

    private int calculatedSum(int length) {
        return (length * (length + 1)) / 2;
    }

}
