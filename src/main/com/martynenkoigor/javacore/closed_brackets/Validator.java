package com.martynenkoigor.javacore.closed_brackets;

import java.util.*;

public class Validator {
    private static final Map<Character, Character> KV = new HashMap<>();
    private static final Stack<Character> stack = new Stack<>();
    private static final Set<Character> openBr = new HashSet<>();
    public static boolean validateBr(String str) {
        KV.put(')', '(');
        KV.put(']', '[');
        KV.put('}', '{');
        openBr.add('{');
        openBr.add('[');
        openBr.add('(');
        for(char currentBracket : str.toCharArray()) {
            if (openBr.contains(currentBracket)) {
                stack.push(currentBracket);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char lastOpenBracket = stack.pop();
                char currentOpenBracket = KV.get(currentBracket);
                if (currentOpenBracket != lastOpenBracket) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
