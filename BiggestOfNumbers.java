import java.util.Scanner;

public class BiggestOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();
        System.out.println(Math.max(Math.max(number1, number2),
                Math.max(number3, number4)));
        sc.close();

    }
}

