
package zayem44java;
import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter a number for loop: ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i+" Burgers");
    }
    }
    
}
