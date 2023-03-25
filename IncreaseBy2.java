import java.util.*;

public class IncreaseBy2 {

    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);

        int n = con.nextInt();

        for (int i = 0; i < n; i++) {

            int val = con.nextInt();

            if (val >= 0) val += 2;

            System.out.print(val + " ");

        }

        System.out.println();

        con.close();

    }

}