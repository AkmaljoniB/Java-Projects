package Codeforces;

import java.util.Scanner;

public class Chet_i_nechet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long t = scanner.nextLong();
        long k = 0;
        if (t<=n/2 && n%2==0){
            System.out.println(t*2-1);
        } else if (n%2==0){
            System.out.println((t-(n/2))*2);
        }
        if (t<=(n+1)/2 && n%2!=0){
            System.out.println(t*2-1);
        } else if (n%2!=0){
            System.out.println((t-((n+1)/2))*2);
        }
    }
}