import java.util.Scanner;

public class MatchModelConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of bricks (N): ");
        int N = scanner.nextInt();

        int matches = calculateMatches(N);
        System.out.println("The least quantity of matches needed is: " + matches);
    }

    public static int calculateMatches(int N) {
        int baseMatches = 9; // Matches needed for 3 bricks

        if (N <= 3) {
            return baseMatches;
        }

        int additionalMatches = (N - 3) * 3; // Matches needed for additional bricks
        return baseMatches + additionalMatches;
    }
}
