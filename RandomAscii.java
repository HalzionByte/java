/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zayem44java;

import java.util.Scanner;
public class RandomAscii {
    public static void main(String[] args) {
        int letter = (int) (1+Math.random()*25.0);
        System.out.println("Symbol: "+(char) letter); //  This 1
        System.out.println("Corresponding value: "+(char)(64+letter));// Or This 2
    }
}
