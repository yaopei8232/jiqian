package com.ibifeng.test;

/**
 * Created by ibf on 2018/12/3.
 */
public class Test {
    public String subStr(String str){
        String[] splits = str.split("=");
        int i = splits[2].lastIndexOf("\\");
        int end = splits[2].lastIndexOf("\"");
        String  substring="";
        if(i>0){
             substring = splits[2].substring(i + 1, end);
            ;
        }else {
            int stat= splits[2].indexOf("\"");
            substring=splits[2].substring(stat+1,end);
        }
        return substring;


    }
    public static void main(String[] args) {
        //form-data; name="file"; filename="icudtl.dat"
        //form-data; name="file"; filename="D:\apache-maven-3.3.9-bin\apache-maven-3.3.9\download.wav"
        String s = new Test().subStr("form-data; name=\"file\"; filename=\"icudtl.dat\"");
        System.out.println(s);
    }
}
