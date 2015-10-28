package main;

/**
 * Created by Aimar on 4.10.2015.
 */
public class Muutujad {

    public static void main(String[] args) {
        int minuRaha = 150;
        int ostukorv = 100;

        minuRaha = minuRaha - ostukorv;

        String minuRahaEurodes = minuRaha + " eurot";

        System.out.println(minuRahaEurodes);
    }
}
