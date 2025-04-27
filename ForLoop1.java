/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zayem44java;

public class ForLoop1 {
    public static void main(String[] args) {
        //number from 20 to 30
        for (int i = 20; i<= 30; i++){
            System.out.println(i);
        }
        System.out.println("");
        int z = (int)(20+Math.random()*31);
        for(int j = 1;j<=z;j++){
            System.out.println((int)(20+Math.random()*31));
        }
    }
}
