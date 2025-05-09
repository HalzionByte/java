
package zayem44java.java;

//Develop a program that determines if a number is even or odd using conditional statements

public class EvenOdd {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter a number:: ");
        int num = in.nextInt();
        switch(num%2){
            case 0 : System.out.println("no is even:: "+num);
            break;
            case 1 : System.out.println("no is Odd:: "+num);
            break;
            default : System.out.println("Invalid input");
        }
        
        if (num%2 == 0){
            System.out.println("No is even :: "+num);
        }
        else{
            System.out.println("No is odd :: "+num);
    }
}
}
