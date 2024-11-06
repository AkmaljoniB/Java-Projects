package Alexeev;

import java.util.Scanner;

public class Alexeev_0511{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(),l=0;
        for(int i=1;i<k;i++)l+=5;
        System.out.println(k<146?(l/60)+" "+(l%60):"NO");
    }
}