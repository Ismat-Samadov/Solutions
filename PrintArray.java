import java.util.*;


public class PrintArray {

    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);

        int n = con.nextInt();

        int m[] = new int[n];

        for (int i = 0; i < n; i++)

            m[i] = con.nextInt();


        for (int i = 0; i < n; i++)

            System.out.println(m[i]);

        con.close();

    }

}