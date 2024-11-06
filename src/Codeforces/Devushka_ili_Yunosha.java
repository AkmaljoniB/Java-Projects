package Codeforces;

import java.util.Scanner;

public class Devushka_ili_Yunosha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length()-1; j > i; j--) {
                if (s.substring(i,i+1).equals(s.substring(j,j+1))){
                    s = s.substring(0,j).concat(s.substring(j+1));
                }
            }
        }
        if (s.length() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}