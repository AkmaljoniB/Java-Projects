package Codeforces;

import java.util.Scanner;

public class Pangrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String s = scanner.nextLine();
        if (Integer.parseInt(n) < 26) {
            System.out.println("NO");
        } else {
            int a=0;
            for (int i = 97; i <= 122; i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.codePointAt(j)==i||s.codePointAt(j)==i-32){
                        a++;
                        break;
                    }
                }
            }
            if (a==26){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}