package com.company;


interface IntSequence{

    void of(int... x);

}

public class Main {

    public static void main(String[] args) {

        IntSequence sequence = new IntSequence() {

            @Override
            public void of(int... x) {
                StringBuilder result = new StringBuilder();
                for (int i=0; i<x.length; i++)
                {
                    result.append(x[i]).append(" ");
                }

                System.out.print(result);

                while (true){
                    System.out.print("1 ");
                }

            }
        };


        sequence.of(1,2,3);

    }

}
