import java.util.Scanner;

public class DivisibilityByNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();

        if (n %a ==0 && n%b ==0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
