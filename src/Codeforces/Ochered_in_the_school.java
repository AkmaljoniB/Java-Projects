package Codeforces;

import java.util.Scanner;

public class Ochered_in_the_school {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String s = scanner.nextLine();
        int t = 0, l = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(" ")) {
                t = Integer.parseInt(str.substring(i + 1));
                l = Integer.parseInt(str.substring(0, i));
                break;
            }
        }
        for (int j = 0; j < t; j++) {
            for (int i = 0; i < l-1; i++) {
                if (s.substring(i, i + 1).equals("B") && s.substring(i+1, i+2).equals("G")) {
                    s = s.substring(0, i).concat("GB").concat(s.substring(i+2));
                    i++;
                }
            }
        }
        System.out.println(s);
    }
}
