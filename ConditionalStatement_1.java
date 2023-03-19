import java.util.Scanner;

public class ConditionalStatement_1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input <5) {
            System.out.println(input*input-3*input+4);
        } else if (input >=5) {
            System.out.println(input+7);
        } else {
            System.out.println(" Enter correct number ");
        }
        sc.close();

    }
}
