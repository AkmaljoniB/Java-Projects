package Alexeev;

import java.util.Scanner;

public class Alexeev_0315 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=2;
        if (s.contains(" "))a=-1;
        else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) - 'A' >= 0 && s.charAt(i) - 'A' < 26) a = Math.max(a, s.charAt(i) - 'A' + 11);
                else if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' < 10) a = Math.max(a, s.charAt(i) - '0' + 1);
                else {
                    a = -1;
                    break;
                }
            }
        }
        System.out.println(a);
    }
}