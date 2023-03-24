import java.util.Scanner;

class DollarsInBank {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long x = 1;
        long k = 1;
        long s = 1;
        while (s < n) {
            k++;
            x = x * 2 + k;
            s = s + x;
        }
        System.out.print(k);
    }
}