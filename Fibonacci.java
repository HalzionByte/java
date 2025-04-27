package zayem44java;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int a = 0, b = 1;
        for (int i=1; i<=num;i++){
            System.out.print(a+"  ");
            int temp = a+b;
            a = b;
            b = temp;
        }
    }  
}
