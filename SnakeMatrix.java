import java.util.Arrays;
import java.util.Scanner;

public class SnakeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // *INPUT*
        int row = scanner.nextInt();
        int col = row;
        int[][] array = new int[row][col];


        for (int i = 0; i < col; i++) {
            if (i % 2 != 0) array[0][i] = col * (i + 1);
            else array[0][i] = (col * i) + 1;
        }

        array[0][0] = 1;


        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j % 2 == 0) array[i][j] = array[i - 1][j] + 1;
                else array[i][j] = array[i - 1][j] - 1;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}