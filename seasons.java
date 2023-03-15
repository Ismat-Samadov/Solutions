import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class seasons {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        List<Integer> Winter = Arrays.asList(12,1, 2);
        List<Integer> Spring = Arrays.asList(3,4,5);
        List<Integer> Summer = Arrays.asList(6,7,8);
        List<Integer> Autumn = Arrays.asList(9,10,11);


        if (Winter.contains(input)) {
            System.out.println("Winter");
        } else if (Spring.contains(input)) {
            System.out.println("Spring");
        } else if (Summer.contains(input)) {
            System.out.println("Summer");
        } else if (Autumn.contains(input)) {
            System.out.println("Autumn");
        }


    }
}