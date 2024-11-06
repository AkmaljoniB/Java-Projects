package Alexeev;

import java.util.Scanner;

public class Alexeev_0803{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt(),b=sc.nextInt(),k=sc.nextInt();
        for(int i=0;i<k;i++)a=a%b*10;
        System.out.println((int)(a/b));
    }
}