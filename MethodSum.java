
package zayem44java.java;

//Implement a method that takes two numbers as parameters and returns their sum.

import java.util.Scanner;
public class MethodSum {
    public static void main(String[] args) {
        int a = 0 , b = 0 ;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no 1:: ");
        a = in.nextInt();
        System.out.print("Enter no 2:: ");
        b = in.nextInt();
        int c = Sum(a,b);
        System.out.println("Sum = "+c);
    }
    public static int Sum(int a,int b){
    int sum = a + b;
    return sum;
    }
}
