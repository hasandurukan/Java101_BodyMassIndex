package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double length, weight;
        Scanner input = new Scanner(System.in);
        System.out.print("Please type your length as m(meter) :");
        length = input.nextDouble();
        System.out.print("Please type your weight as kg(kilogram) :");
        weight = input.nextDouble();
        double bmi = weight / (length * length);
        System.out.print("Your body mass index is " + bmi);
    }
}
