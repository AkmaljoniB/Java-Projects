package Codeforces;

import java.util.Scanner;

public class Genadiy_i_kartochnaya_igra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k=0;
        for (int i = 0 ; i <5;i++){
            String s1=scanner.next();
            if (s1.substring(0,1).equals(s.substring(0,1))||s1.substring(1,2).equals(s.substring(1,2))){
                System.out.println("YES");
                k++;
                break;
            }
        }
        if (k==0) {
            System.out.println("NO");
        }
    }
}