package com.company;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Comparator<String> stringComparatorLambda =
                (o1, o2) -> o1.compareTo(o2);

        int lambdaComparator = stringComparatorLambda.compare("b", "a");
        System.out.println(lambdaComparator);

    }
}
