import java.util.Scanner;

public class firstorLast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        int n1 = input / 100 % 10;
        int n2 = input / 10 % 10;
        int n3 = input % 10;

        if (n1 > n3) {
            System.out.println(n1);
        } else if (n3 > n1) {
            System.out.println(n3);

        } else {
            System.out.println("=");}
    }
}