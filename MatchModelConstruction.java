import java.util.Scanner;

public class MatchModelConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of bricks (N): ");
        int N = scanner.nextInt();

        int matches = calculateMatches(N);
        System.out.println("The least quantity of matches needed is: " + matches);
        scanner.close();
    }

    public static int calculateMatches(int N) {
        int MatchesCount;
        if (N == 1) {
            MatchesCount = 12;
        } else if (N == 0) {
            MatchesCount = 0;
        } else {
            MatchesCount = (N - 1) * 8 + 12;
        }
        return MatchesCount;
    }
}
