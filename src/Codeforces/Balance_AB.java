package Codeforces;

import java.util.Scanner;

public class Balance_AB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            System.out.println(s.charAt(s.length()-1)+s.substring(1));
        }
    }
}