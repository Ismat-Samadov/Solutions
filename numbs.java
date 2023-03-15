import java.util.Scanner;
public class numbs {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        int n5 = input / 10 % 10;
        int n6 = input % 10;
        System.out.println( n5 + " " + n6);

    }
}