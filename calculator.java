package zayem44java;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter no1: ");
            double no1 = in.nextDouble();
            System.out.print("Enter no2: ");
            double no2 = in.nextDouble();
            System.out.print("press \n(1) Addition\n(2) Subtraction\n(3) Multiplication\n(4) Division\n(5) Remainder\n");
            byte choice = in.nextByte();
            switch(choice){
                case 1: System.out.println(no1+" + "+no2+" = "+(no1+no2));
                break;
                case 2: System.out.println(no1+" - "+no2+" = "+(no1-no2));
                break;
                case 3: System.out.println(no1+" * "+no2+" = "+(no1*no2));
                break;
                case 4: System.out.println(no1+" / "+no2+" = "+(no1/no2));
                break;
                case 5: System.out.println(no1+" % "+no2+" = "+(no1%no2));
                break;
            }
    }
}
