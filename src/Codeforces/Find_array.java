package Codeforces;

import java.util.Scanner;

public class Find_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            long s=0;
            for (int i = 0; i < n; i++) s+=scanner.nextInt();
            for (int i = 0; i < n; i++) System.out.print((s/n)+" ");
            System.out.println();
        }
    }
}
