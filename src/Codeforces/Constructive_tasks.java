package Codeforces;

import java.util.Scanner;

public class Constructive_tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            System.out.println(Math.max(n,m));
        }
    }
}
