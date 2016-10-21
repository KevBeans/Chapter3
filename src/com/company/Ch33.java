package com.company;

import java.util.Scanner;

public class Ch33 {
    public static void main(String[] args) {

        //Time converter
        //1 hour = 60 minutes
        //1 minute = 60 seconds

        double hour;
        double minute;
        int second;
        double endsecond;
        double endminute;
        final double M_PER_H = 60.0;
        Scanner in = new Scanner(System.in);

        System.out.print("Input seconds: ");
        second = in.nextInt();
        minute = (int)(second / M_PER_H);
        endminute = minute % M_PER_H;
        hour = minute / 60.0;
        endsecond = hour % 60.0;
        System.out.printf("%d hours, %d minutes and %d seconds.",(int)hour , (int)endminute, (int)endsecond);
    }
}
