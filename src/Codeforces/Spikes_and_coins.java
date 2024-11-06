package Codeforces;

import java.util.Scanner;

public class Spikes_and_coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            sc.nextInt();
            String s=sc.next();
            if (s.contains("**"))s=s.substring(0,s.indexOf("**"));
            System.out.println(s.length()-s.replace("@","").length());
        }
    }
}