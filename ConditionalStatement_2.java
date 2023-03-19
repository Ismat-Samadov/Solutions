import java.util.Scanner;

public class ConditionalStatement_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        if (x >= 10) {
            System.out.println(x * x * x + 5 * x);
        } else {
            System.out.println(x * x - 2 * x + 4);
        }
        sc.close();
    }
}
