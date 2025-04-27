package zayem44java;

/* Grade calculator
 */

import java.util.Scanner;
public class Zayem44java {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean z = true;
        while(z==true){
             double per=0;
        int ch = 0,total = 0,mark = 0;
        System.out.print("Enter no of subjects: ");
        ch = in.nextInt();
        for(int i = 1;i<=ch;i++){
            System.out.print("Enter marks of sub"+i+": ");
            mark = in.nextInt();
            total += mark;
        }
        per = (total/(100.0*ch))*100;
        System.out.println("percentage: "+per);
        if (per >= 80 && per <= 100) {
            System.out.println("A grade");
        } else if (per >= 60) {
            System.out.println("B grade");
        } else if (per >= 50) {
            System.out.println("C grade");
        } else if (per >= 45) {
            System.out.println("D grade");
        } else if (per >= 25) {
            System.out.println("E grade");
        } else if (per < 25) {
            System.out.println("F grade");
        } else {
            System.out.println("Error");
        }
        System.out.print("continue? y/n ");
        char a = in.next().charAt(0);
        switch (a){
          case 'y':
                case 'Y': z=true;
                break;
                case 'n':
                case 'N': z=false;
                    System.out.println("loop terminated");
                break;
                default: System.out.println("continued ");
                
            }                
        }
       
}
}
