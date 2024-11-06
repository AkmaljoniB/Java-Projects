package Alexeev;

import java.util.Scanner;

public class Alexeev_0876{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[]arr=sc.nextLine().split(" ");
        double a=Double.parseDouble(arr[0]),b=Double.parseDouble(arr[1]),r=Double.parseDouble(arr[2]),max=0;
        double a1=0,b1=0;
        for(double i=0;i<r*r;i+=0.00001){
            double c=Math.sqrt(r*r-i)*a+Math.sqrt(i)*b;
            if(c>max){
                max=c;
                a1=Math.sqrt(r*r-i);
                b1=Math.sqrt(i);
            }
        }
        String s=String.format("%.12f",max).replace(",",".");
        System.out.println(s);
        s=String.format("%.12f",a1).replace(",",".");
        System.out.print(s+" ");
        s=String.format("%.12f",b1).replace(",",".");
        System.out.print(s);
    }
}