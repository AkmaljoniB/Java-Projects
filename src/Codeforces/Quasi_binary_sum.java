package Codeforces;

import java.util.Scanner;

public class Quasi_binary_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = String.valueOf(n);
        StringBuilder f = new StringBuilder();
        String l = "1111111";
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) min = Math.min(min, Integer.parseInt(s.substring(i, i + 1)));
        for (int i = 0; i < min; i++) {
            int p = Integer.parseInt(l.substring(0,s.length()));
            f.append(p).append(" ");
            n-=p;
        }
        s = String.valueOf(n);
        while (n!=0){
            String p ="";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0')p=p+"1";
                else p=p+"0";
            }
            int o =Integer.parseInt(p);
            n-=o;
            s = String.valueOf(n);
            f.append(o).append(" ");
            min++;
        }
        System.out.println(min);
        System.out.println(f);
    }
}
