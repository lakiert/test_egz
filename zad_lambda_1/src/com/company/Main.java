package com.company;

interface StringFunction{
    String run(String str);
}


public class Main {

    public static void printFormatted(String str, StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }

    public static void main(String[] args) {

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";

        printFormatted("Hello", ask);
        printFormatted("Hello", exclaim);

    }
}