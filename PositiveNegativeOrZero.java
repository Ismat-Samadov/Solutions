import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input > 0) {
            System.out.println("Positive");
        } else if (input < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        sc.close();

    }
}
