
package zayem44java;

import java.util.Scanner;
public class CheckSquareShape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double len = 0,height = 0;
        System.out.println("Program to check if shape is square");
        System.out.print("Enter length: ");
        len = in.nextDouble();
        System.out.print("Enter breadth: ");
        height = in.nextDouble();
        if (len == height){
            System.out.println("Shape is a Square");
        }
        else{
            System.out.println("Shape is not a Square");
        }
    }
}
