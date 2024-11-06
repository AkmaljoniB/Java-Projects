package Alexeev;

import java.util.Scanner;

public class Alexeev_0520{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=n/144,c=n%144/12,p=n%144%12;
        if(c>10){
            if(p>1){
                k++;
                c=0;
                p=0;
            }
        }
        if(p>9){
            p=0;
            c++;
        }
        System.out.println(k+" "+c+" "+p);
    }
}