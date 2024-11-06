package Codeforces;

import java.util.Scanner;

public class Electronic_tables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            if (s.charAt(0)=='R'&&Character.isDigit(s.charAt(1)) &&s.contains("C")){
                int a=Integer.parseInt(s.substring(s.indexOf("C")+1)),q=676;
                String p="";
                while (a > 0) {
                    if (a % 26 == 0){
                        p = "Z" + p;
                        a--;
                    } else p = (char)('A'+a%26-1)+p;
                    a /= 26;
                }
                System.out.println(p+s.substring(s.indexOf("R")+1,s.indexOf("C")));
            }else {
                String f="",p="R";
                for (int i=0;i<s.length();i++) {
                    if (Character.isDigit(s.charAt(i))){
                        f=s.substring(0,i);
                        p=p+s.substring(i);
                        break;
                    }
                }
                int l=1,r=0;
                for (int i=f.length()-1;i>=0;i--) {
                    r+=(f.charAt(i)-'A'+1)*l;
                    l*=26;
                }
                System.out.println(p+"C"+r);
            }
        }
    }
}

//RZ228