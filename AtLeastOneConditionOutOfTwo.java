import java.util.Scanner;

public class ExactlyOneConditionOutOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = (int) (Math.log10(n) + 1);
        if (n % 2 != 0 || (n > 0 && length == 3)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();

    }
}
