
package zayem44java;
import java.util.Scanner;
public class ArrayExample {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("enter no of subjects:: ");
            byte nos = in.nextByte();
            int [] marks = new int[nos];
            populate(marks);
            percentage(marks);
            print(marks);
    }
    public static void print(int[] args) {
        for(int i=0;i<args.length;i++){
                System.out.println("Subject "+(i+1)+" marks:: "+args[i]);
            } 
        System.out.println("");
    }
    public static void populate(int[] arr) {
        
        for(int i = 0; i<arr.length;i++){
            arr[i] = 50 + (int) (Math.random()*51);
        }
        System.out.println(""); 
    }
    public static void percentage(int[] args) {
        int sum = 0;
        double per = 0.0;
        for (int i =0; i<args.length;i++){
            sum += args[i];
        }
        System.out.println("sum:: "+sum);
        per = (sum/(args.length*100.0))*100.0;
        System.out.print("percentage:: "+per);
        System.out.println("");
    }
}
