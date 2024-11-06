package Codeforces;

import java.util.Scanner;

public class Ilya_i_bankovskiy_schet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n>0){
            System.out.println(n);
        } else {
            String s = String.valueOf(n);
            s = s.substring(0,s.length()-2).concat(s.substring(s.length()-1));
            int max = Math.max(n/10, Integer.parseInt(s));
            System.out.println(max);
        }
    }
}