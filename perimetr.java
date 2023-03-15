import java.util.Scanner;

public class perimetr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stones = scan.nextInt();
        int friends = scan.nextInt();
        int perimetr =2*stones + 2 *friends;
        System.out.println(perimetr);
    }
}