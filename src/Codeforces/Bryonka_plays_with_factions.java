package Codeforces;

import java.util.Scanner;

public class Bryonka_plays_with_factions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
            int i=2;
            if (a*d==b*c)i=0;
            else if (a==0||c==0||(b*c)%(a*d)==0||(a*d)%(b*c)==0)i=1;
            System.out.println(i);
        }
    }
}