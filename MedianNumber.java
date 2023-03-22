import java.util.*;

public class Main {
    static int min(int x, int y, int z) {

        return Math.min(x, Math.min(y, z));

    }

    static int max(int x, int y, int z) {

        return Math.max(x, Math.max(y, z));

    }


    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);

        int a = con.nextInt();

        int b = con.nextInt();

        int c = con.nextInt();

        int res = a + b + c - max(a, b, c) - min(a, b, c);

        System.out.println(res);

        con.close();

    }

}