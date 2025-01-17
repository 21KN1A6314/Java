import java.io.*;
import java.util.Scanner;
class P4 {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dividend");
        a=sc.nextInt();
        System.out.println("Enter the Divisor");
        b=sc.nextInt();
        if(b!=0){
        c=a / b;
        System.out.println("quotient " + c);
        }
        else{
            System.out.println("b is 0 not allowed");    
        }
       sc.close(); 
    }
}