import java.util.Scanner;

public class SumOfDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = 1;
        long sum = 1;
        while (sum % k != 0) {
            n++;
            sum += n;
        }
        System.out.println(n);
    }
}