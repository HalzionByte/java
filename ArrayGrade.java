
package zayem44java.java;

//Write a program that stores and processes student grades using arrays

public class ArrayGrade {
    public static void main(String[] args) {
        int[] marks = new int[5];
        for (int i = 0;i<=marks.length-1;i++){
            marks[i] = 49 + (int) (Math.random()*50);
        }
        int sum = 0;
        for (int i = 0; i <= marks.length-1;i++){
            sum += marks[i];
        }
        double per = (sum / (100.0*marks.length )) * 100.0;
        System.out.println("Sum  :: "+sum+"\nPercentage :: "+per+"%");
    }
}
