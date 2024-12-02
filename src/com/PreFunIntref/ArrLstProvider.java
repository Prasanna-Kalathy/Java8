package com.PreFunIntref;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntFunction;

public class ArrLstProvider {
    //Array List using Math Random Function
    public static IntFunction<List<Integer>> ArrRdmMath = len -> {
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i <= len; i++) {
            int num = (int) (Math.random() * len);
            lst.add(num);
        }
        return lst;
    };

    //Array List using Random Class
    public static IntFunction<List<Integer>> ArrRdmCls = len -> {
        List<Integer> lst = new ArrayList<>();
        Random rdm = new Random();

        for (int i = 1; i <= len; i++) {
            int num = rdm.nextInt(len);
            lst.add(num);    
        }
        return lst;
    };
}
