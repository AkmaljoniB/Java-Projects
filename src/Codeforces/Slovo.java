package Codeforces;

import java.util.Scanner;

public class Slovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = 0,m=0;
        for (int i = 0 ; i<s.length();i++){
            if (s.codePointAt(i)>=97 && s.codePointAt(i)<=122){
                m++;
            }
            if (s.codePointAt(i)>=65 && s.codePointAt(i)<=90){
                n++;
            }
        }
        if (n>m){
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}