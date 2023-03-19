import java.util.Scanner;

public class BiggestOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();

//        if (number1 < 1000 && number2 < 1000 && number3 < 1000 && number4 < 1000) {
//            if (number1 > number2 && number1 > number3 && number1 > number4) {
//                System.out.println(number1);
//            } else if (number2 > number1 && number2 > number3 && number2 > number4) {
//                System.out.println(number2);
//            } else if (number3 > number1 && number3 > number2 && number3 > number4) {
//                System.out.println(number3);
//            } else {
//                System.out.println(number4);
//            }
//        }
//        else {System.out.println("out of range");}
        
        System.out.println(Math.max(Math.max(number1, number2), Math.max(number3, number4)));
        sc.close();

    }
}

