import java.util.Scanner;

public class WaterAndIce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t > 0) {
            System.out.println("Water");
        } else  {
            System.out.println("Ice");
        }
        sc.close();
    }
}
