
// Java Program to Print Rectangle Star Pattern

import java.util.Scanner;

public class RectanglePattern {
    private static Scanner sc;

    public static void main(String[] args) {
        int rows, columns, i = 1, j;
        sc = new Scanner(System.in);

        rows = sc.nextInt();

        columns = 3;

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