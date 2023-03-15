import java.util.Scanner;

public class results {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input >= 1 && input <= 3) {
            System.out.println("Initial");
        } else if (input >= 4 && input <= 6) {
            System.out.println("Average");
        } else if (input >= 7 && input <= 9) {
            System.out.println("Sufficient");
        } else if (input >= 10 && input <= 12) {
            System.out.println("High");
        }


    }
}