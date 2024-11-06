package Codeforces;

import java.util.Scanner;

public class Correct_bracket_sequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            String s ="(";
            for (int i =0;i<n;i++) {
                System.out.print("()");
                s = s.concat("()");
            }
            System.out.println();
            s = s.substring(0,s.length()-2)+")";
            int l = n*2-3;
            for (int i = 1;i<n;i++){
                System.out.println(s);
                s = s.substring(0,l)+")()"+s.substring(l+3);
                l-=2;
            }
        }
    }
}
