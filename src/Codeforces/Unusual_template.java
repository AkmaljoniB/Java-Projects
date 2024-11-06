package Codeforces;

import java.util.Scanner;

public class Unusual_template {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String a=sc.next(),b=sc.next(),c=sc.next(),s="NO";
            for (int i=0;i<n;i++) {
                if (!a.substring(i,i+1).equals(c.substring(i,i+1)) &&!b.substring(i,i+1).equals(c.substring(i,i+1))){
                    s="YES";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}