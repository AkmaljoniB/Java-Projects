package Codeforces;

import java.util.Scanner;

public class Udalenie_dvukh_sosednikh_bukv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int k = 0;
            String s = scanner.next();
            String c = scanner.next();
            for (int i = 0; i < s.length(); i++) {
                if (s.substring(i,i+1).equals(c) && i%2==0){
                    System.out.println("Yes");
                    k++;
                    break;
                }
            }
            if (k == 0) {
                System.out.println("No");
            }
        }
    }
}