import java.util.Scanner;

public class DivisibilityByDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int n0 = input / 1000 % 10;
        int n1 = input / 100 % 10;
        int n2 = input / 10 % 10;
        int n3 = input % 10;
        if (n0 > 0 && n1 > 0 && n2 > 0 && n3 > 0) {
            if (input % n0 == 0 &&
                    input % n1 == 0 &&
                    input % n2 == 0 &&
                    input % n3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
        sc.close();

    }

}

