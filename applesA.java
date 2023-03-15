import java.util.Scanner;

public class applesA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int student = scan.nextInt();
        int apple = scan.nextInt();
        int apple_per_student =apple /student ;
        int zenbil =apple-apple_per_student;
        System.out.print(apple_per_student);

    }
}