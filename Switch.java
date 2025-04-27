/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zayem44java;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 for circle\n2 for rectangle \n3 for triangle\n::: ");
        int ch = in.nextInt();
        switch(ch){
            case 1 : System.out.print("enter radius of circle:: ");
            double radius = in.nextDouble();
                System.out.println("Area = "+(Math.PI*Math.pow(radius, 2)));
                break;
            case 2 : System.out.print("enter lenght:: ");
                double length = in.nextDouble();
                System.out.print("enter width:: ");
                double width = in.nextDouble();
                System.out.println("Area = "+(length*width));
                break;
            case 3 : System.out.print("Enter height:: ");
            double height = in.nextDouble();
                System.out.print("Enter base:: ");
                double base = in.nextDouble();
                System.out.println("Area = "+(0.5*height*base));
                break;
            default: System.out.println("Invalid input");
        }
    }
}
