package Codeforces;

import java.util.Scanner;

public class Uprazdnenie_na_stroki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String sadonok = "aeiouy";
        a = a.toLowerCase();
        String s ="";
        for (int i = 0; i < sadonok.length(); i++) {
            a=a.replace(sadonok.substring(i,i+1),"");
        }
        for (int i = 0 ;i<a.length();i++){
            s = s.concat(".")+a.substring(i,i+1);
        }
        System.out.println(s);
    }
}