package Codeforces;

import java.util.Scanner;

public class Number_of_apartments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if (n%5==0) System.out.println("0 "+(n/5)+" 0");
            else if (n%3==0) System.out.println((n/3)+" 0 0");
            else if (n%7==0) System.out.println("0 0 "+(n/7));
            else if (n%10==6||(n%10==1&&n>10)) System.out.println("2 "+((n-6)/5)+" 0");
            else if ((n%10==7||n%10==2)&&n>10)System.out.println("4 "+((n-12)/5)+" 0");
            else if (n%10==3||n%10==8) System.out.println("1 "+((n-3)/5)+" 0");
            else if ((n%10==9 ||n%10==4)&&n>10) System.out.println("0 "+((n-14)/5)+" 2");
            else System.out.println(-1);
        }
    }
}