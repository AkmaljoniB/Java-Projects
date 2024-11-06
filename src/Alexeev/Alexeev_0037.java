package Alexeev;

import java.util.*;

public class Alexeev_0037{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double q=sc.nextDouble();
        String s="Yes";
        while(n-->0){
            int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt();
            double x=Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2)),y=Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2));
            if(x*q<y){
                s="No";
                break;
            }
        }
        System.out.println(s);
    }
}