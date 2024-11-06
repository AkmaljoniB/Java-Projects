package Codeforces;

import java.util.Scanner;

public class Double_activation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int q=s.replace("0","").length();
            System.out.println(q%2==0?q==2&&s.contains("11")?"NO":"YES":"NO");
        }
    }
}
