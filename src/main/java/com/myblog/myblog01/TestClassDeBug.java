package com.myblog.myblog01;

public class TestClassDeBug {

    public static void main(String[] args) {
        TestClassDeBug testClassDeBug=new TestClassDeBug();
        int val = testClassDeBug.test();
        System.out.println(val);
    }
    public int test(){
        int otp = SampleTestDeBug.test1();
        return otp;
    }
}
