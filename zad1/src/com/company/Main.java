package com.company;
import java.math.BigInteger;
import java.time.LocalDate;


public class Main {

    static class ArrayUtil {
        public static <T extends Comparable<T>> boolean isSorted(T[] array) {
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i + 1].compareTo(array[i]) < 0) return false;
            }
            return true;
        }
    }


    public static void main(String[] args) {

        BigInteger[] sortedBig = new BigInteger[]
                {
                        BigInteger.valueOf(11111),
                        BigInteger.valueOf(22222),
                        BigInteger.valueOf(33333),
                        BigInteger.valueOf(44444)
                };

        BigInteger[] unsortedBig = new BigInteger[]
                {
                        BigInteger.valueOf(22222),
                        BigInteger.valueOf(11111),
                        BigInteger.valueOf(44444),
                        BigInteger.valueOf(33333)
                };

        Integer[] sortedInts = new Integer[]{5, 7, 94, 901, 901, 901, 5236};
        Integer[] unsortedInts = new Integer[]{7246, 901, 9, 523};
        LocalDate[] sortedDates = new LocalDate[]
                {
                        LocalDate.of(2020,8,2),
                        LocalDate.of(2020,10,16),
                        LocalDate.of(2020,11,21),
                        LocalDate.of(2021,4,13)
                };

        LocalDate[] unsortedDates = new LocalDate[]
                {
                        LocalDate.of(2021,8,29),
                        LocalDate.of(2019,11,1),
                        LocalDate.of(2020,3,6),
                        LocalDate.of(2021,12,3)
                };

        String[] sortedString = new String[]{"aa", "b", "c", "d"};
        String[] unsortedString = new String[]{"d", "c", "a", "b"};



        System.out.println(ArrayUtil.isSorted(sortedInts));
        System.out.println(ArrayUtil.isSorted(unsortedInts));
        System.out.println(ArrayUtil.isSorted(sortedDates));
        System.out.println(ArrayUtil.isSorted(unsortedDates));
        System.out.println(ArrayUtil.isSorted(sortedBig));
        System.out.println(ArrayUtil.isSorted(unsortedBig));
        System.out.println(ArrayUtil.isSorted(sortedString));
        System.out.println(ArrayUtil.isSorted(unsortedString));

    }
}