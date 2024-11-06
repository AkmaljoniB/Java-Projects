package Alexeev;

import java.util.*;
public class Alexeev_0785{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        for (int i=a;i<=b;i++){
            String s=(long)i*i+"";
            if (s.endsWith(i+""))System.out.println(i);
        }
    }
}