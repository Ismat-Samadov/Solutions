import java.util.*;


public class UseTheFunction {

    public static double min(double x, double y) {

        return (x < y) ? x : y;

    }


    public static double max(double x, double y) {

        return (x > y) ? x : y;

    }


    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);

        double x = con.nextDouble();

        double y = con.nextDouble();

        double z = con.nextDouble();


        double res = min(min(max(x, y), max(y, z)), x + y + z);

        System.out.println(res);

        con.close();

    }

}