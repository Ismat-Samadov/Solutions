import java.util.Scanner;

import java.lang.Math;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int result = (int) Math.pow(a, n);
        System.out.print(result);
        sc.close();

    }
}
