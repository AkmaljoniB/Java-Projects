package Codeforces;

import java.util.Scanner;

public class Petya_i_Stroki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        s1 =s1.toLowerCase();
        s2=s2.toLowerCase();
        int a=0;
        for (int i = 0 ; i < s1.length(); i++){
            if (s1.codePointAt(i)>s2.codePointAt(i)){
                System.out.println(1);
                a++;
                break;
            }
            if (s1.codePointAt(i)<s2.codePointAt(i)){
                System.out.println(-1);
                a++;
                break;
            }
        }
        if (a==0){
            System.out.println(0);
        }
    }
}