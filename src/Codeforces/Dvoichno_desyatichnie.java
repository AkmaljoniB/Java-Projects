package Codeforces;

import java.util.Scanner;

public class Dvoichno_desyatichnie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s = String.valueOf(n);
            int max =0;
            for (int j = 0 ;  j<s.length();j++){
                max = Math.max(max,Integer.parseInt(s.substring(j,j+1)));
            }
            System.out.println(max);
        }
    }
}