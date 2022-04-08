package com.sey.testproject.jacocosample;

public class JavaJacoco {

    public String hello(String name) {
        switch (name){
            case "하":
                return "이";

            case "hello":
                return "everyone";

            default:
                return "hi";
        }
    }

    public void returnString(){
        System.out.println("return String");
    }

}
