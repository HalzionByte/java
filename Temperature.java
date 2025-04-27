package zayem44java;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Convert Celcius to Fahrenheit");
        System.out.print("Enter temperature in Celciuss: ");
        double celcius = in.nextDouble();
        System.out.println("Given temperature in celcius is: "+celcius);
        double fahrenheit = celcius * (9/5) + 32;
        System.out.println("Temperature in Fahrenheit= "+fahrenheit);
    }
}
