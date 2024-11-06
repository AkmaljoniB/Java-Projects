package Codeforces;

import java.util.Scanner;

public class Futboll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a=0;
        for (int i = 0; i < s.length() - 6; i++) {
            if (s.substring(i, i + 7).equals("0000000") || s.substring(i, i + 7).equals("1111111")) {
                System.out.println("YES");
                a++;
                break;
            }
        }
        if (a==0){
            System.out.println("NO");
        }
    }
}