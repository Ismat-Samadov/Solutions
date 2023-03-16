import java.util.Scanner;

public class first_and_last_sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int n0 = input / 1000 % 10;
        int n1 = input / 100 % 10;
        int n2 = input / 10 % 10;
        int n3 = input % 10;
        System.out.println(n0 + n3 );

    }
}