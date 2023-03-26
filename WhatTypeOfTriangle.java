import java.util.*;


public class WhatTypeOfTriangle {

    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);

        int a = con.nextInt();

        int b = con.nextInt();

        int c = con.nextInt();


        if ((a == b) && (b == c))

            System.out.println("1");

        else if ((a == b) || (a == c) || (b == c))

            System.out.println("2");

        else

            System.out.println("3");


        con.close();

    }

}