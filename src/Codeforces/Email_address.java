package Codeforces;

import java.util.Scanner;

public class Email_address {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        s=s.replace("dot",".");
        s=s.replaceFirst("at","@");
        if (s.charAt(0) == '.')s="dot"+s.substring(1);
        if (s.charAt(s.length()-1) == '.')s=s.substring(0,s.length()-1)+"dot";
        if (s.charAt(0) == '@')s="at"+s.substring(1).replaceFirst("at","@");
        System.out.println(s);
    }
}
