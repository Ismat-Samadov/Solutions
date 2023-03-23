import java.util.Scanner;

class ProductOfDigits {

    static int getProduct(int n) {
        int product = 1;


        while (n != 0) {
            product = product * (n % 10);
            n = n / 10;
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int n = input;

        System.out.println(getProduct(n));
    }
}