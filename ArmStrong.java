
package zayem44java;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        String numstr = Integer.toString(num);
        int len = numstr.length();
        int sum = 0;
        for (int i = 0; i<len; i++){
            int digit = Character.getNumericValue(numstr.charAt(i));
            sum += Math.pow(digit,len);
        }
        if (num == sum){
            System.out.println(num+" is an armstrong number");
        }
        else{
            System.out.println("its not armstrong");
        }
    }
    
    
}
