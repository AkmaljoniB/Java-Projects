package Codeforces;

import java.util.Scanner;

public class Kamni_na_Stole {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String n = scanner.nextLine();
        String s = scanner.nextLine();
        int a=0;
        for (int i = 0 ; i <s.length()-1;i++){
            if (s.substring(i,i+1).equals(s.substring(i+1,i+2))){
                a++;
            }
        }
        System.out.println(a);
    }
}