package Codeforces;

import java.util.Scanner;

public class Buying_shovels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int k =scanner.nextInt();
            int min=n;
            for (int i = 1;i<=Math.min(Math.sqrt(n),k);i++){
                if (n%i==0) {
                    if (n/i<=k) {
                        n = i;
                        break;
                    } else min=Math.min(min,n/i);
                }
            }
            System.out.println(Math.min(n,min));
        }
    }
}