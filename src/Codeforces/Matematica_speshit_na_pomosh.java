package Codeforces;

import java.util.Scanner;

public class Matematica_speshit_na_pomosh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String str = "";
        int a1 =0,a2=0,a3=0;
        for (int i = 0 ; i  <s.length();i++){
            if (s.substring(i,i+1).equals("1")){
                a1++;
            }
            if (s.substring(i,i+1).equals("2")){
                a2++;
            }
            if (s.substring(i,i+1).equals("3")){
                a3++;
            }
        }
        for (int i = 0 ; i < a1;i++){
            str = str.concat("1+");
        }
        for (int i = 0 ; i < a2;i++){
            str = str.concat("2+");
        }
        for (int i = 0 ; i < a3;i++){
            str = str.concat("3+");
        }
        str = str.substring(0,str.length()-1);
        System.out.println(str);
    }
}