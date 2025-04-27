
package zayem44java;


public class Patterns {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;

        while (i <= n) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
            i++;
        }

        i = n - 1;
        while (i >= 1) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}

    


            