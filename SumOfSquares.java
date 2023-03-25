import java.util.*;

public class SumOfSquares {

    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);

        long a = con.nextInt();

        long b = con.nextInt();

        System.out.println(a * a + b * b);

        con.close();
    }

}