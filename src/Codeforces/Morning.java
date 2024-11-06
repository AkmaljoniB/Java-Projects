package Codeforces;

import java.util.Scanner;

public class Morning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next(),a="1234567890";
            int l=a.indexOf(s.substring(0,1))+1;
            for (int i=1;i<4;i++) l+=Math.abs(a.indexOf(s.substring(i-1,i))-a.indexOf(s.substring(i,i+1)))+1;
            System.out.println(l);
        }
    }
}
