package com.nullvoid.generics.Numerical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumericalOperations<N extends Number & Comparable<N>> { // Bounded Types
    private List<N> operands; //Instance Variable List of N
    public NumericalOperations(List<N> operands) { // Constructor w/ param of List type multiple operands
        this.operands = new ArrayList<>(operands);
        /* Assign to instance variable the param
        Arraylist takes incoming list, in some cases if somebody tries to pass an immutable list to test a class,
        then we are trying to set a defense against it. */
    }

    public List<N> sortNumbers(){ // It will return list of N
        Collections.sort(operands);
        return operands;
    }

    public N getMax(){ // N because it has to return a number
        return Collections.max(operands); // Return the max of a Number <N>
    }

}
