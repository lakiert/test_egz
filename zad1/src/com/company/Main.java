package com.company;


interface IntSequence{

    String of(int... x);

}

public class Main {

    public static void main(String[] args) {

        IntSequence sequence = new IntSequence() {
            @Override
            public String of(int... x) {
                StringBuilder result = new StringBuilder();

                for (int i=0; i<x.length; i++)
                {
                    result.append(x[i]).append(" ");
                }

                return result.toString();

            }
        };


        System.out.println(sequence.of(1,2,3));


    }

}
