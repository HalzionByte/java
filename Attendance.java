
package zayem44java;

import java.util.Scanner;
public class Attendance {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte no_held = 0;
        double per = 0, no_attended = 0;
        System.out.print("Enter the total no of classes held for this subject:");
        no_held = in.nextByte();
        System.out.print("Enter the no of attended classes for this subject:");
        no_attended = in.nextDouble();
        per = (no_attended/no_held)*100.0;
        System.out.println("percentage: "+per);
        if (per>=75){
            System.out.println("ALLOWED TO SIT IN EXAM HALL");
        }
        else{
            System.out.println("NOT ALLOWED TO SIT IN EXAM HALL");
        }
    }
}
