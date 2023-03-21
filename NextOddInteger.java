import java.util.Scanner;

public class NextOddInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input % 2 != 0) {
            System.out.println(input + 2);
        } else if (input % 2 == 0) {
            System.out.println(input + 1);
        } else {
            System.out.println(" Enter correct number ");
        }
        sc.close();

    }
}
