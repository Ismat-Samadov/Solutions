import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n = (int) Math.floor(n / 2);
                x += 1;
            } else {
                n += 1;
                x += 1;
            }
        }
        System.out.print(x);

    }
}
