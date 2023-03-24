import java.util.Scanner;

public class SquareOfTheSum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = n / 10 % 10;
        int n3 = n % 10;
        int squareofthesum = (n2 + n3) * (n2 + n3);
        System.out.println(squareofthesum);
    }
}
