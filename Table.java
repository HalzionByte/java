
package zayem44java.java;

//Create a program that prints the multiplication table for numbers 1 through 10 using loops

public class Table {
    public static void main(String[] args) {
       for(int i = 1; i <=  10 ; i++){
            for (int j = 1 ; j<=10;j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println("");
        }
        int i =1;
        while (i <= 10){
            int j =1;
            while(j<=10){
                System.out.println(i+" x "+j+" = "+(i*j));
                j++;
            }
            i++;
            System.out.println("");
    }
      
        do{
            int j = 1;
            do{
                System.out.println(i+" x "+j+" = "+(i*j));
                j++;
            }while(j<=10);
            i++;
        }while(i<=10);
    }
}
