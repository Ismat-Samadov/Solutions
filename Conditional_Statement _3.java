import java.util.Scanner;

public class ConditionalStatement_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= -100 && x <= 100) {
            if (x < -4) {
                System.out.println(x + 5);
            } else if (x >= -4 && x <= 7) {
                System.out.println(x * x - 3 * x);
            } else if (x > 7) {
                System.out.println(x * x * x + 2 * x);
            }
        } else {
            System.out.println("numbers must be -100 and 100 interval");
        }
        sc.close();
    }
}
