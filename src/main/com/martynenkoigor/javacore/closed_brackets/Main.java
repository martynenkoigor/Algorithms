package com.martynenkoigor.javacore.closed_brackets;

import java.util.*;

public class Main {
    private static final  String str = "{[()]";

    public static void main(String[] args) {
          boolean res = Validator.validateBr(str);
        System.out.println(res);
    }
}
