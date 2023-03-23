import java.util.Scanner;

public class SnakeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col, num, i, j, k;
        row = sc.nextInt();
        col = row;
        num = 1;
        k = 1;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= col; j++) {
                System.out.print(num + "\t");
                num = num + k;
            }
            if (i % 2 == 1) {
                num = num + col - 1;
                k = -1;
            } else {
                num = num + col + 1;
                k = 1;
            }
            System.out.println("");
        }
    }
}