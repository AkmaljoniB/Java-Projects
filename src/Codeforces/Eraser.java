package Codeforces;

import java.util.Scanner;

public class Eraser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String s = scanner.next();
            int l = 0;
            for (int i =0;i<n;i++){
                if (s.startsWith("B", i)){
                    i+=k-1;
                    l++;
                }
            }
            System.out.println(l);
        }
    }
}
