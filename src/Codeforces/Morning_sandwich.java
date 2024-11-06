package Codeforces;

import java.util.Scanner;

public class Morning_sandwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int b =scanner.nextInt();
            int c =scanner.nextInt();
            int h =scanner.nextInt();
            int min = Math.min(b-1,c+h);
            if (b==c+h) System.out.println(b+c+h-1);
            else System.out.println(min*2+1);
        }
    }
}