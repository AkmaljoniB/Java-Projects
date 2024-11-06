package Codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Vosstanovlenie_perestanovka_posle_sliyaniya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scanner.nextInt();
            Set<Integer> set = new LinkedHashSet<>();
            for (int i = 0; i < n*2; i++) {
                int a= scanner.nextInt();
                set.add(a);
            }
            String s = String.valueOf(set);
            s= s.replace(",","");
            System.out.println(s.substring(1,s.length()-1));
        }
    }
}