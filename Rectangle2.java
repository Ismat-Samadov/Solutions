
// Java Program to Print Rectangle Star Pattern

import java.util.Scanner;

public class Rectangle2 {
    private static Scanner sc;

    public static void main(String[] args) {
        int rows, columns, i = 1, j;
        sc = new Scanner(System.in);

        rows = sc.nextInt();

        columns = sc.nextInt();

        while (i <= rows) {
            j = 1;

            while (j <= columns) {
                System.out.print("#");
                j++;
            }
            i++;
            System.out.print("\n");
        }
    }
}