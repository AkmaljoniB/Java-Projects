package Codeforces;

import java.util.Scanner;

public class Pripisat_i_dopisat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        for (int i = 0 ; i  < Integer.parseInt(n);i++){
            String k =scanner.nextLine();
            String s =scanner.nextLine();
            for (int j = 0 ;j<s.length();j++){
                if (s.substring(0,1).equals("0") && s.substring(s.length()-1).equals("1")|| (s.substring(0,1).equals("1") && s.substring(s.length()-1).equals("0"))){
                    s= s.substring(1,s.length()-1);
                    j=0;
                } else {
                    break;
                }
            }
            System.out.println(s.length());
        }
    }
}