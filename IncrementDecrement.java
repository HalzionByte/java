
package zayem44java;

import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a whole  number: ");
        int i = in.nextInt();
        System.out.println("This is an exampe of increment operator i++: "+(i++));
        System.out.println(i);
        System.out.println("This is an exampe of increment operator ++i: "+(++i));
        System.out.println(i);
        System.out.println("This is an exampe of decrement operator i--: "+(i--));
        System.out.println(i);
        System.out.println("This is an exampe of increment operator --i: "+(--i));
        System.out.println(i);
    }
}
