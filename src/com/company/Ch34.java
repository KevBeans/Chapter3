package com.company;

import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.abs;

public class Ch34 {
    public static void main(String[] args) {

        //Enquire number
        int guess;
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between and including 1 and 100...");
        System.out.print("Take a guess: ");
        guess = in.nextInt();
        System.out.println("Your guess is: " + guess);

        //RNG
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        //difference
        int difference = abs(guess - number);
        System.out.println("The number I was thinking of was: " + number);
        System.out.println("Your guess was off by " + difference);
    }
}