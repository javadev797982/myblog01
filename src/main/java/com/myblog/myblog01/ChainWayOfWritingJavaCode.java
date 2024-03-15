package com.myblog.myblog01;

public class ChainWayOfWritingJavaCode {
    public static void main(String[] args) {
        new ChainWayOfWritingJavaCode().example();

    }
    public ChainWayOfWritingJavaCode test(){
        return new ChainWayOfWritingJavaCode();
    }
    public void example(){
        System.out.println("hello");
    }
}
