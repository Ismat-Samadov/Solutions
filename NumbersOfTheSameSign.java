import java.util.Scanner;

public class NumbersOfTheSameSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        if ((n > 0 && m > 0) || (n < 0 && m < 0)) {
            System.out.println(1);
        } else {
            System.out.println(1);
        }
        sc.close();
    }
}
