import java.util.Scanner;

public class NoneOfTheTwoConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (
                (n % 2 == 0 && n > 0) || (n % 2 != 0 && n < 0)
        ) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        sc.close();

    }
}
