import java.util.Scanner;

public class MinMaxSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstInput = sc.nextInt();
        int SecondInput = sc.nextInt();
        int Max;
        int Min;
        if (FirstInput > SecondInput) {
            Max = FirstInput;
            Min = SecondInput;
            System.out.print(Min);
            System.out.print(" ");
            System.out.print(Max);
        } else {
            Max = SecondInput;
            Min = FirstInput;
            System.out.print(Min);
            System.out.print(" ");
            System.out.print(Max);
        }
        sc.close();

    }
}
