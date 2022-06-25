package com.nullvoid.generics.Numerical;

import java.util.ArrayList;
import java.util.List;

public class NumericalTest {
    public static void main(String[] args) {
        List<Long> longList = List.of(12L, 1L, 2L); // new ArrayList<>() also works
        NumericalOperations<Long> numericalOperations = new NumericalOperations<Long>(longList);
        System.out.println(numericalOperations.sortNumbers());
        System.out.println(numericalOperations.getMax());
    }
}
