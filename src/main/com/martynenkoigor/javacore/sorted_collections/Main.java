package com.martynenkoigor.javacore.sorted_collections;

import java.util.*;

public class Main {
    private static final int[] firstArray = {5, 10, -3, 6, 101};
    private static final int[] secondArray = {-3, 101, 10, 8, 0};


    private final static Collection<Integer> firstColl = new LinkedList<>();
    private final static Collection<Integer> secondColl = new LinkedList<>();

    public static void main(String[] args) {

        for(int i : firstArray) {
            firstColl.add(i);
        }
        for(int i : secondArray) {
            secondColl.add(i);
        }


        CollectionHelper.searchForCommonElements(firstColl, secondColl);
    }

}
