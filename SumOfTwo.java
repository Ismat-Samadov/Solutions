import java.util.*;


public class SumOfTwo {

    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);

        int t = con.nextInt();

        while (t-- > 0) {

            int a = con.nextInt();

            int b = con.nextInt();

            System.out.println(a + b);

        }

        con.close();

    }

}