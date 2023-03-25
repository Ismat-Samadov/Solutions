import java.util.*;


public class ArithmethicMean {

    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);

        int n = con.nextInt();

        double s = 0;

        int cnt = 0;

        for (int i = 0; i < n; i++) {

            double val = con.nextDouble();

            if (val > 0) {

                s += val;

                cnt++;

            }

        }

        if (cnt == 0) System.out.println("Not Found");

        else

            System.out.printf("%.2f\n", s / cnt);

        con.close();

    }

}