
package zayem44java;

import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String email = "example@gmail.com" ;
        String pass = "example1234";
        System.out.print("Enter login email: ");
        String logemail = in.nextLine();
        if (email.equals(logemail)){
            System.out.print("Enter password: ");
            String logpass = in.nextLine();
            if (pass.equals(logpass)){
                System.out.println("You are logged in");
            }
            else{
                System.out.println("Wrong password");
            }
         
        }
        else{
            System.out.println("Wrong email");
        }
    }
}
