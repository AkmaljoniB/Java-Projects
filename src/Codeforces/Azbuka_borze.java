package Codeforces;

import java.util.Scanner;

public class Azbuka_borze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String p = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals(".")) {
                p = p.concat("0");
                s = s.substring(i+1);
                i--;
            } else if (i!=s.length()-1 && s.substring(i, i + 2).equals("-.")) {
                p = p.concat("1");
                s = s.substring(i+2);
                i--;
            } else if (i!=s.length()-1 &&s.substring(i, i + 2).equals("--")) {
                p = p.concat("2");
                s = s.substring(i+2);
                i--;
            }
        }
        System.out.println(p);
    }
}