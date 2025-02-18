import java.io.*;
import java.util.Scanner;
class P9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number of units was consumed:");
        int units = sc.nextInt();
        int bill=0;
        if(units>50){
            if(units>=100){
                if(units>200){
                    bill=units*8;
                }
                else
                bill = units*6;

            }
            else 
            bill = units*4;
        }
        System.out.println("Andra Pradesh Electricity PVT.LTD");
        System.out.println("Units Consumed: "+units);
        System.out.println("Bill amount is : "+bill);

    }
}