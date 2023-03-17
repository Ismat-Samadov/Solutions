import java.util.*;



public class buildings

{

    public static void main(String []args)

    {

        Scanner con = new Scanner(System.in);

        int n = con.nextInt();

        int m = con.nextInt();



        if ((n + m) % 2 == 0)

            System.out.println("1");

        else

            System.out.println("0");



        con.close();

    }

}