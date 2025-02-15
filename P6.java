import java.io.*;
import java.util.Scanner;
class P6 {
    public static void main(String[] args){
        int sum=0 ;
        System.out.println("the sum of odd numbers are :");
        for(int i=0;i<=100;i++){
        if(i%2 != 0){
            sum = sum + i;
            }
        }
     System.out.println(sum );     
    }
}