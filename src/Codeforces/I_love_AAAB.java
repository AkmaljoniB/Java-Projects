package Codeforces;

import java.util.Scanner;

public class I_love_AAAB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next(),p="YES";
            if (s.replace("B","").length()<s.replace("A","").length() ||!s.endsWith("B"))p="NO";
            int l1=0;
            for (int i=0;i<s.length();i++){
                if (s.charAt(i) == 'A')l1++;
                else l1--;
                if (l1<0){
                    p="NO";
                    break;
                }
            }
            System.out.println(p);
        }
    }
}