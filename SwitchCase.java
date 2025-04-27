
package zayem44java;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numerical Grade ");
        int ch = in.nextInt();
        switch(ch/10){
            case 10:
            case 9: System.out.println("A Grade"); break;
            case 8:System.out.println("B Grade"); break;
            case 7:System.out.println("C Grade"); break;
            case 6: System.out.println("D grade"); break;
            default: System.out.println("Fail");
        } 
    }  
}
