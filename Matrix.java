import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        int m = con.nextInt();
        int a[][] = new int[n + 1][m + 1];

        int cnt = 1;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                a[i][j] = cnt++;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        con.close();
    }
}
