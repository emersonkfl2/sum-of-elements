package com.test.bluecoding;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class FirstUniqueSum {

    public static void main(String[] args) {
        int[] case1 = new int[]{1, 31, 5, 5, 5, 27, 12, 26, 31, 12, 26, 3};
        // Given an array of numbers, return the sum of the numbers that are not repeated.
        assertEquals(getSum(case1), 31);

        int[] case2= new int[]{2,5,5,25,25,1,2,8,31,8};
        assertEquals(getSum(case2), 32);
        System.out.println("SUCCESS!!");

    }
    private static <T> void assertEquals(T actual, T expected) {
        if (!Objects.equals(actual, expected))
            throw new IllegalStateException(String.format("Expected value: <%s> but was: <%s>", expected, actual));
    }

    private static Integer getSum(int[] array) {
//        Integer filterElements = Arrays.stream(array).collect( );
        Integer sumOfElements =  Arrays.stream(array).filter(arr -> Arrays.stream(array).filter(x -> x == arr).count()
        )).sum();

        return sumOfElements;
    }
}