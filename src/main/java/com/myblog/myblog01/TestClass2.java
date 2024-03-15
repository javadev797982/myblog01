package com.myblog.myblog01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass2 {
    public static void main(String[] args) {
        //evenNumber
//        List<Integer> num = Arrays.asList(10, 12, 13, 16, 17, 19, 20, 27, 29);
//        List<Integer> even = num.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(even);
//
//        //odd number
//        List<Integer> nums = Arrays.asList(11, 12, 10, 13, 16, 20, 22, 29);
//        List<Integer> odd = nums.stream().filter(y -> y % 2 != 0).collect(Collectors.toList());
//        System.out.println(odd);
//
//
//        List<String> str = Arrays.asList("mike", "adam", "Bang", "mike", "stalin");
//        List<String> res1 = str.stream().filter(s -> s.endsWith("g")).collect(Collectors.toList());
//        List<String> res2 = str.stream().filter(s -> s.startsWith("m")).collect(Collectors.toList());
//        List<String> res3 = str.stream().filter(s -> s.equals("adam")).collect(Collectors.toList());
//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println(res3);

        //Function functional interface

//        Function<Integer,Integer> result= i->i+10;
//        Integer data = result.apply(40);
//        System.out.println(data);

//        //length
//        Function<String,Integer> result=str->str.length();
//        Integer data = result.apply("mike");
//        System.out.println(data);

        //Add by 10 in the given collection

//        List<Integer> number = Arrays.asList(10, 20, 1, 22, 30, 40, 90);
//        List<Integer> newNum = number.stream().map(i -> i + 10).collect(Collectors.toList());
//        System.out.println(newNum);

//        //sort the given collection
//
//        List<Integer> data = Arrays.asList(1, 20, 80, 40, 50, 3);
//        List<Integer> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);

//        //uppercase
//
//        List<String> data = Arrays.asList("mike", "stalin", "adam");
//        List<String> newData = data.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newData);


        //sort string

        List<String> data = Arrays.asList("mike", "stalin", "adam");
        List<String> newData = data.stream().sorted().collect(Collectors.toList());
        System.out.println(newData);



    }
}
