package com.myblog.myblog01;

public class SampleTestDeBug {
    public static int test1() {
        SampleTestDeBug sampleTestDeBug=new SampleTestDeBug();
        int otp = sampleTestDeBug.returnOtp();
        return otp;
    }
    public int returnOtp(){
        return 123456;
    }
}
