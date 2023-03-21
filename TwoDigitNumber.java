import java.util.Scanner;

public class TwoDigitNumber {

    public static void main(String[] args) {

        int count = 0;
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (; num != 0; num /= 10, ++count) {
        }
        if (count == 2) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}