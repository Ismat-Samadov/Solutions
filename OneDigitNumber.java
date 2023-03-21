import java.util.Scanner;

public class OneDigitNumber {

    public static void main(String[] args) {

        int count = 0;
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (; num != 0; num /= 10, ++count) {
        }
        if (count > 1) {
            System.out.println("No");
        } else {
            System.out.println("Ok");
        }
    }
}