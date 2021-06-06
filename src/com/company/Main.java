/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("What is the first number? ");
                String string1 = in.nextLine();

                System.out.print("What is the second number? ");
                String string2 = in.nextLine();

                int num1 = Integer.parseInt(string1);
                int num2 = Integer.parseInt(string2);

                int add = num1 + num2;
                int sub = num1 - num2;
                int multiply = num1 * num2;
                int division = num1 / num2;

                String output = num1 + " + " + num1 +" = " + add + "\n" + num1 + " - " + num2 +" = " + sub + "\n" + num1 + " * " + num2 +" = " + multiply + "\n" + num1 + " / " + num2 +" = " + division + "\n";
                System.out.print(output);
    }
}
