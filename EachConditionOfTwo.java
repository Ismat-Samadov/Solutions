import java.util.Scanner;

public class EachConditionOfOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int length = (int) (Math.log10(n) + 1);
        if (
                n % 6 == 0 && length == 2 && (n > 9 && n < 100)
        ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        sc.close();

    }
}
