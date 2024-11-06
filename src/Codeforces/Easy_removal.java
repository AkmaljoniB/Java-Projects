package Codeforces;

import java.util.Scanner;

public class Easy_removal {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        for(int t=sc.nextInt();t-->0;){
            String s = sc.next();
            System.out.println(s.indexOf("9") > s.indexOf("1") ? "91" : "19");
        }
    }
}