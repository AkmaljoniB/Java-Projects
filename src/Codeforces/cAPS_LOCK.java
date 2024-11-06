package Codeforces;

import java.util.Scanner;

public class cAPS_LOCK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String a = s.toUpperCase();
        if (s.equals(a)){
            System.out.println(s.toLowerCase());
        } else if (s.substring(1).equals(a.substring(1))){
            s= s.toLowerCase();
            s = s.substring(0,1).toUpperCase().concat(s.substring(1));
            System.out.println(s);
        } else {
            System.out.println(s);
        }
    }
}