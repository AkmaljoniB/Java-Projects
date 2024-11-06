package Codeforces;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int i = 10;
        while (k > 0) {
            i += 9;
            String s = String.valueOf(i);
            int l =0;
            for (int j = 0; j < s.length(); j++) {
                l+=Integer.parseInt(s.substring(j,j+1));
            }
            if (l==10)k--;
        }
        System.out.println(i);
    }
}
