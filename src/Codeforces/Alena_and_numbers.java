package Codeforces;

import java.util.Scanner;

public class Alena_and_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt(),m=sc.nextInt();
        long a=n%5>0?1:0,b=n%5>1?1:0,c=n%5>2?1:0,d=n%5>3?1:0;
        long a1=m%5>3?1:0,b1=m%5>2?1:0,c1=m%5>1?1:0,d1=m%5>0?1:0;
        System.out.println((a+n/5)*(m/5+a1)+(b+n/5)*(m/5+b1)+(c+n/5)*(m/5+c1)+(d+n/5)*(m/5+d1)+(n/5)*(m/5));
    }
}