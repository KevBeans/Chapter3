package com.company;
import java.util.Scanner;

public class Ch32 {
    public static void main(String[] args) {

        //Temperature converter
        //1C = 3F

        int c;
        double f;
        final double F_PER_C = 1.8;
        Scanner in = new Scanner(System.in);

        System.out.print("Input temperature in Celsius: ");
        c = in.nextInt();
        f = (double) c * F_PER_C + 32;
        System.out.printf("Celsius = %.1f Fahrenheit.", f);
    }
}