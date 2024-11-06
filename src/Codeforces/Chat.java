package Codeforces;

import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (a == 0 && s.substring(i, i + 1).equals("h")) {
                a++;
            }
            if (a == 1 && s.substring(i, i + 1).equals("e")) {
                a++;
            }
            if (a >= 2 && a <= 3 && s.substring(i, i + 1).equals("l")) {
                a++;
            }
            if (a == 4 && s.substring(i, i + 1).equals("o")) {
                a++;
            }
        }
        if (a==5){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}