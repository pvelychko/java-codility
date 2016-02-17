package com.pvelychko.arrays;

import com.sun.tools.javac.util.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Find value that occurs in odd number of elements.
 *
 *
 *
 * Created by pvelychko on 17/02/16.
 */
public final class OddOccurrencesInArray {

    public static void main(String[] args) {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

        Assert.check(oddOccurrencesInArray.solution(new int[]{9, 3, 9, 3, 9, 7, 9}) == 7);
    }

    public int solution(int[] A) {
        List<Integer> pairs = new ArrayList<>();

        for(int number: A) {
            if (pairs.contains(number)) {
                pairs.remove(pairs.indexOf(number));
            } else {
                pairs.add(number);
            }
        }

        return pairs.get(0);
    }

}
