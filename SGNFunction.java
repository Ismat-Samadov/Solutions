import java.util.Scanner;

public class ConditionalStatement_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println(1);
        } else if (x < 0) {
            System.out.println(-1);
        } else if (x == 0) {
            System.out.println(0);
        }
        sc.close();
    }
}
