package Codeforces;

import java.util.Scanner;

public class Mocha_and_red_blue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), l = 0;
            String s = sc.next();
            int p=s.indexOf("R"),o=s.indexOf("B");
            if ((o==-1 ||Math.min(p,o)==p)&& p !=-1){
                if (p%2==0)l^=1;
            }else if (o!=-1){
                if (o%2!=0)l^=1;
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '?') {
                    if (i!=0){
                        if (s.charAt(i-1)=='B')l=1;
                        else if (s.charAt(i-1)=='R')l=0;
                    }
                    if (l == 0) s = s.substring(0, i) + "B" + s.substring(i + 1);
                    else s = s.substring(0, i) + "R" + s.substring(i + 1);
                    l ^= 1;
                }
            }
            System.out.println(s);
        }
    }
}