import java.util.*;
public class min_and_max{
    public static void main(String[] args) {  
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();



        int max =Math.max(a,  b);
        int min =Math.min( a,  b);

        System.out.print(min + " " +max);
      
        
     
}}