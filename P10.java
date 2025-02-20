import java.io.*;
import java.util.Scanner;
class P10 {
    public static void main(String[] args){
        int n,r,arm=0,arg;
        System.out.println("Enter a number to cheak given number is armstrong or not");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        arg=n;
        while (n>0){
            r = n % 10;
            arm =arm + (r*r*r);
            n=n/10;
        }    
        if(arg == arm){
            System.out.println(arg  + " is an armstrong number");
        }
        else{
            System.out.println(arg + " is Not a armstrong number");
        }
    }
} 
    