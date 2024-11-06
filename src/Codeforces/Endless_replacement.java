package Codeforces;

import java.util.Scanner;

public class Endless_replacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int t=sc.nextInt();t-->0;){
            String s = sc.next(), p = sc.next();
            if (p.equals("a"))s="1";
            else if (p.contains("a"))s="-1";
            else s= (long) Math.pow(2,s.length())+"";
            System.out.println(s);
        }
    }
}
