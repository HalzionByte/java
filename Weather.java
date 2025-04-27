/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zayem44java;

import java.util.Scanner;
public class Weather {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temp =0;
        System.out.print("Enter the temperature in Celsius: ");
        temp = in.nextDouble();

        if (temp <= 0) {
            System.out.println("It's Freezing! Stay warm.");
        } else if (temp > 0 && temp <= 15) {
            System.out.println("It's Cold. Wear a jacket!");
        } else if (temp > 15 && temp <= 25) {
            System.out.println("The weather is Pleasant ");
        } else if (temp > 25 && temp <= 35) {
            System.out.println("It's getting Hot. Stay hydrated!");
        } else if (temp > 35) {
            System.out.println("It's Very Hot , Avoid going out!");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
