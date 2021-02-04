package com.martynenkoigor.javacore.sorted_collections;

import java.util.*;

public class CollectionHelper {
    public static Collection<Integer> searchForCommonElements(Collection<Integer> firstColl, Collection<Integer> secondColl) {
        System.out.println(firstColl);
        System.out.println(secondColl);

        Set<Integer> second = new HashSet<>(secondColl);

        Set<Integer> result = new TreeSet<>();

        for(int i : firstColl) {
            if (second.contains(i)) {
                result.add(i);
            }
        }

        System.out.println(result);

        return result;
    }
}
