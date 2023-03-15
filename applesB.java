import java.util.Scanner;

public class applesB {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int student = scan.nextInt();
        int apple = scan.nextInt();
        int apple_per_student =apple /student ;
        int zenbil =apple-(apple_per_student*student);
        System.out.print(zenbil);

    }
}