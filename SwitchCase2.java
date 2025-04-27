/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zayem44java;

import java.util.Scanner;
public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double elec_price = 0 , grocery_price = 0 ,cloth_price = 0;
        int i = 1;
        do{
            System.out.print("Enter category\n1. Electronics\n2. Grocery\n3. Clothes\n4. Exit\n::::::: ");
            int ch = in.nextInt();
            double price = 0;
            switch(ch){
                case 1: System.out.print("Enter price:: ");
                        price =  in.nextDouble();
                        elec_price += price;
                    break;
                case 2:System.out.print("Enter price:: ");
                        price =  in.nextDouble();
                        grocery_price += price;
                    break;
                case 3: System.out.print("Enter price:: ");
                        price =  in.nextDouble();
                        cloth_price += price;
                    break;
                case 4: i = 0;
                    break;
            } 
        }while(i!=0);
        System.out.println("Total for Electronics :: "+elec_price);
        System.out.println("Total for Grocery :: "+grocery_price);
        System.out.println("Total for Electronics :: "+cloth_price);
        System.out.println("GRAND TOTAL:: "+(elec_price+grocery_price+cloth_price));
    }
}
