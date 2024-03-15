package com.myblog.myblog01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//give employee name based on age//and based on city
public class EmployeeClass {
    public static void main(String[] args) {

//        List<Employee> employees=Arrays.asList(
//             new Employee("mike",30,"chennai"),
//             new Employee("adam",25,"chennai") ,
//             new Employee("stallin",31,"pune"),
//             new Employee("sam",34,"banglore")
//        );
//        //filter based on age
//        List<Employee> emps = employees.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());
//
//        for (Employee e: emps){
//            System.out.println(e.getName());
//            System.out.println(e.getAge());
//            System.out.println(e.getCity());
//        }

//        //find even number and square even number
//        //then find sum of square values
//        List<Integer> numbers = Arrays.asList(10, 12, 6, 5, 7, 8, 9);
//        List<Integer> data = numbers.stream().filter(n1 -> n1 % 2 == 0).map(n2 -> n2 * n2).collect(Collectors.toList());
//        System.out.println(data);


        //vvi- groupingBy example-group based on city/age
//
//                List<Employee> employees=Arrays.asList(
//             new Employee("mike",30,"chennai"),
//             new Employee("adam",25,"chennai") ,
//             new Employee("stallin",31,"pune"),
//             new Employee("sam",34,"banglore")
//                );
//        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));
//        System.out.println(collect);

        //vvi- groupingBy example-group based on city/age

        List<Employee> employees=Arrays.asList(
                new Employee("mike",30,"chennai"),
                new Employee("adam",25,"chennai") ,
                new Employee("stallin",34,"pune"),
                new Employee("sam",34,"banglore")
        );

        //based on age
//        Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getAge()));
//       // System.out.println(collect);
//        for (Map.Entry<Integer,List<Employee>> entry: collect.entrySet()){
//            int age=entry.getKey();//will get key
//            List<Employee> employeesWithAge=entry.getValue();//will get value
//            System.out.println("age:"+age+"---");
//            for (Employee e:employeesWithAge){
//                System.out.println(e.getCity());
//                System.out.println(e.getName());
//            }
//        }


        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));
        // System.out.println(collect);
        for (Map.Entry<String,List<Employee>> entry: collect.entrySet()){
            String city=entry.getKey();//will get key
            List<Employee> employeesWithCity=entry.getValue();//will get value
            System.out.println("city:"+city+"---");
            for (Employee e:employeesWithCity){
                System.out.println(e.getCity());
                System.out.println(e.getName());
            }
        }



    }
}
