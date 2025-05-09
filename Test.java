
package zayem44java.java;


public class Test {
    public static void main(String[] args) {
        NewClass rect1 = new NewClass(4,40);
        NewClass rect2 = new NewClass(3.5,35.9);
        System.out.println("This is rectagle 1:: ");
        System.out.println("width is :::  "+rect1.width);
        System.out.println("Height is  :::   "+rect1.height);
        System.out.println("Area is   :::   "+rect1.GetArea());
        System.out.println("Perimeter is   ::::   "+rect1.Perimeter());
        System.out.println("  ");
        System.out.println("This is rectagle 1:: ");
        System.out.println("width is :::  "+rect2.width);
        System.out.println("Height is  :::   "+rect2.height);
        System.out.println("Area is   :::   "+rect2.GetArea());
        System.out.println("Perimeter is   ::::   "+rect2.Perimeter());
    }
}
