import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0 && b > 0) {
            if (a % b == 0) {
                System.out.println("Divisible");
            } else {
                int quotient = a / b;
                int remainder = a % b;
                System.out.print(quotient + " ");
                System.out.print(remainder);
            }
        } else {
            System.out.print("please enter positive number");
        }
        sc.close();

    }
}
