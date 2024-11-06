package Codeforces;

import java.util.Scanner;

public class Binary_imbalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            String s =scanner.next();
            int l =s.replace("1","").length();
            if (l>s.length()-l) System.out.println("YES");
            else {
                if (s.contains("01")||s.contains("10")) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
