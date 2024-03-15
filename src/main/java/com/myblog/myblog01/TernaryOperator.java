package com.myblog.myblog01;

public class TernaryOperator {
    public static void main(String[] args) {

        //result=(conditions) ? expression1 : expression2//if condition is true expression1 will run if false then expression2 will run
        int x = 10;
        int y=20;

        // Using ternary operator to find the maxm of two numbers
       int max=(x>y) ? x:y;

        System.out.println("The max value is: " + max);
    }
}
