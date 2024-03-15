package com.myblog.myblog01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass3 {
    public static void main(String[] args) {
        //even number//
        List<Integer> num = Arrays.asList(10, 20, 22, 13, 17, 21, 19, 100);
        List<Integer> evenNum = num.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNum);

        List<Integer> nums = Arrays.asList(3, 5, 48, 9, 10, 11, 12, 13, 15, 20, 21, 23);
        List<Integer> oddNum = nums.stream().filter(y -> y % 2 != 0).collect(Collectors.toList());
        System.out.println(oddNum);

        List<String> str = Arrays.asList("mike", "umar", "satya", "mike", "Bang");
        List<String> data1 = str.stream().filter(s -> s.equals("umar")).collect(Collectors.toList());
        List<String> data2 = str.stream().filter(s -> s.equals("m")).collect(Collectors.toList());
        List<String> data3 = str.stream().filter(s -> s.endsWith("g")).collect(Collectors.toList());

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

    }

}
