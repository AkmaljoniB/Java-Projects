package Alexeev;

import java.util.Scanner;

public class Alexeev_0409 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=sc.nextInt();
        double s=0;
        for(int i=1;i<n;i++){
            int b=sc.nextInt();
            s+= (double) (a + b) /2;
            a=b;
        }
        String p=String.format("%.10f",s/(n-1)).replace(",",".");
        System.out.println(p);
    }
}
