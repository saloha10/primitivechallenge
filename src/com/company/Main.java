package com.company;

public class Main {

    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        //10L gångras med 80 (byte, short, int)
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println(longTotal);

ok



    }
}
