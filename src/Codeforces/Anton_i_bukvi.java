package Codeforces;

import java.util.Scanner;

public class Anton_i_bukvi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = "";
        for (int i = 1; i < s.length() - 1; i = i + 3) {
            s1 = s1.concat(s.substring(i, i + 1));
        }
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.substring(i, i + 1).equals(s1.substring(j, j + 1))) {
                    s1 = s1.substring(0,j).concat(s1.substring(j+1));
                    j--;
                }
            }
        }
        System.out.println(s1.length());
    }
}