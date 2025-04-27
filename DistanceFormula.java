/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zayem44java;

import java.util.Scanner;
public class DistanceFormula {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double distance = 0, x1=0, x2=0, y1=0, y2=0;
        System.out.print("Enter value of x1: ");
        x1 = in.nextDouble();
         System.out.print("Enter value of x2: ");
        x2 = in.nextDouble();
         System.out.print("Enter value of y1: ");
        y1 = in.nextDouble();
         System.out.print("Enter value of y2: ");
        y2 = in.nextDouble();
        distance = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        System.out.println("Distance from point a to b is: "+distance);
    }
}
