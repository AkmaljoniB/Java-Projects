package Codeforces;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            long n =scanner.nextLong();
            long k =scanner.nextLong();
            if(n%2==0||k%2!=0)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
