package com.myblog.myblog01;
//Dsa Question//collection


import java.util.Arrays;
import java.util.Collection;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

//Stream Api concept-help in manuplate the data
//Functional interface remaining part(Predicate,Function,Consumer,Supplier
public class TestClass1 {

    public static void main(String[] args) {

        //Predicate<>Example//Functional Interface

//        Predicate<Integer> val= y->y%2==0;//checking even number by Predicate//dont remember // not use predicate this way
//        boolean result = val.test(10);
//        System.out.println(result);

//        //for string

//        Predicate<String> val= str->str.equals("mike");
//        boolean result = val.test("Stalin");
//        System.out.println(result);



//        //find even number of an arrayList
//        //Stream Api is applied on Collection or data Structure
//        List<Integer> numbers = Arrays.asList(10, 12, 1, 5, 16, 19, 20, 21);
//        Collection<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenNumbers);


        //        //find odd number of an arrayList
//        //Stream Api is applied on Collection or data Structure
//        List<Integer> numbers = Arrays.asList(10, 12, 1, 5, 16, 19, 20, 21);
//        Collection<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
//        System.out.println(oddNumbers);


        //Give name that starts letter a//give name mike//end with letter n
//        List<String> str = Arrays.asList("mike","adam","mike","stalin");
//        List<String> data1 = str.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
//        List<String> data2 = str.stream().filter(s -> s.equals("mike")).collect(Collectors.toList());
//        List<String> data3 = str.stream().filter(s -> s.endsWith("n")).collect(Collectors.toList());
//        System.out.println(data1);
//        System.out.println(data2);
//        System.out.println(data3);

        //Function functional interface-it takes one input and generate an output.does not filter the record

        //qn. give me the length of the word//String input & Integer output
//         Function<String,Integer> result=str->str.length();
//        Integer val = result.apply("mike");
//        System.out.println(val);

        //Integer input & integer output

//        Function<Integer,Integer> result =i->i+10;
//        Integer val = result.apply(30);
//        System.out.println(val);

        //add numbers by 10

//        List<Integer> data = Arrays.asList(10, 20, 30, 60, 90);
//        List<Integer> newNumbers = data.stream().map(i -> i + 10).collect(Collectors.toList());
//        System.out.println(newNumbers);


//        //convert every name to upper case
//
//        List<String> data = Arrays.asList("mike", "stalin", "adam");
//        List<String> newData = data.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newData);


//        //convert every name to lower case
//
//        List<String> data = Arrays.asList("mike", "Stalin", "adam");
//        List<String> newData = data.stream().map(i -> i.toLowerCase()).collect(Collectors.toList());
//        System.out.println(newData);

//        //find number starts with "1"
//
//        List<Integer> data = Arrays.asList(15, 3, 60, 100, 1,11,117);
//        List<Integer> newData = data.stream().filter(i->i.toString().startsWith("1")).collect(Collectors.toList());
//        System.out.println(newData);



        //sort the string

//        List<String> data = Arrays.asList("mike", "stalin", "adam");
//        List<String> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);

        //sort the integer

//        List<Integer> data = Arrays.asList(15, 3, 60, 100, 1);
//        List<Integer> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);

//        //remove duplicate element from given collection
//
//        List<Integer> data = Arrays.asList(15, 3,  60, 100, 1,15,100,60);
//        List<Integer> newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);


        //Consumer functional interface-one input no output

//       Consumer<Integer> result=number-> System.out.println(number);
//        result.accept(100);



//        List<String> names = Arrays.asList("mike", "adam", "sam");
//          Consumer<String> val=name-> System.out.println(name);
//        names.forEach(val);


//        //Supplier functional interface-only gives output
//
//       Supplier<Integer> x=()-> new Random().nextInt(500);
//        Integer y = x.get();
//        System.out.println(y);



    }
}
