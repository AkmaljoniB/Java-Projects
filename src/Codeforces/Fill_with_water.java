package Codeforces;

import java.util.Scanner;

public class Fill_with_water {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            if (s.contains("...")) {
                System.out.println(2);
            } else {
                int k = 0,l=0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '.'){
                        l++;
                    } else {
                        k+=l;
                        l=0;
                    }
                }
                System.out.println(k+l);
            }
        }
    }
}
