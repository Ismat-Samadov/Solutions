import java.util.Scanner;

public class sahe {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stones = scan.nextInt();
        int friends = scan.nextInt();
        int perimetr = stones*friends;
        System.out.println(perimetr);
    }
}