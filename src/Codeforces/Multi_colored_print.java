package Codeforces;

import java.util.Scanner;

public class Multi_colored_print {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            if (s.length()==1&&!s.equals("W")) System.out.println("NO");
            else {
                String q="YES",p="";
                while (s.contains("W")){
                    p=s.substring(0,s.indexOf("W"));
                    if (!p.equals("")) {
                        if (!p.contains("R") || !p.contains("B")){
                            q="NO";
                            break;
                        }
                    }
                    s = s.substring(s.indexOf("W") + 1);
                }
                if (!s.equals("")&&(!s.contains("R")||!s.contains("B")))q="NO";
                System.out.println(q);
            }
        }
    }
}