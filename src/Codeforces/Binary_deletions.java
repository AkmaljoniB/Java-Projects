package Codeforces;

import java.util.Scanner;

public class Binary_deletions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            for(int i=0;i<s.length()-1;i++){
                if (s.charAt(i)=='1'&&s.charAt(i+1)=='0')s=s.substring(0,i)+s.substring(i+1);
                else if (s.charAt(i)=='1'&&s.charAt(i+1)=='1')break;
            }
            for(int i=s.length()-1;i>0;i--){
                if (s.charAt(i)=='0'&&s.charAt(i-1)=='1'){
                    s=s.substring(0,i)+s.substring(i+1);
                } else if (s.charAt(i)=='0'&&s.charAt(i-1)=='0')break;
            }
            System.out.println(s.contains("10")?"NO":"YES");
        }
    }
}