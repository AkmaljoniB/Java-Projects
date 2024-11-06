package Codeforces;

import java.util.Scanner;

public class Konfeti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int p = 2;
            int  s= 3;
            while(n%s!=0){
                p*=2;
                s+=p;
            }
            System.out.println(n/s);
        }
    }
}