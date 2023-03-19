import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input %2 ==0) {
            System.out.println("EVEN");
        } else if (input != 0) {
            System.out.println("ODD");
        } else {
            System.out.println(" Enter correct number ");
        }
        sc.close();

    }
}
