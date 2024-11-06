package Codeforces;

import java.util.Scanner;

public class Maximum_strength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String l=sc.next(),r=sc.next();
            int k=0;
            if (l.length()==r.length()) {
                for (int i=0;i<l.length();i++) {
                    if (l.charAt(i)!=r.charAt(i)){
                        k+=r.charAt(i)-l.charAt(i)+(r.length()-i-1)*9;
                        break;
                    }
                }
            }else k+=(r.length()-1)*9+(r.charAt(0)-'0');
            System.out.println(k);
        }
    }
}
