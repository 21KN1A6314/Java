import java.io.*;
import java.util.Scanner;
class P8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int  sum=0, rem=0 ;
        while (num>0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;


        }

          System.out.println("sum of digits are :" + sum);
    }
}