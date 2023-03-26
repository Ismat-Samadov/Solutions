import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.printf("%.6f", Math.sqrt(n));
    }
}
