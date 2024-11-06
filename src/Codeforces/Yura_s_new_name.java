package Codeforces;

import java.util.Scanner;

public class Yura_s_new_name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int k=0;
            for (int i=0;i<s.length()-1;i++)if (s.charAt(i)=='_'&&s.charAt(i+1)=='_')k++;
            if (s.charAt(0)=='_')k++;
            if (s.charAt(s.length()-1)=='_')k++;
            if (s.equals("^"))k++;
            System.out.println(k);
        }
    }
}
