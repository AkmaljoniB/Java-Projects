package Codeforces;

import java.util.Scanner;

public class Vlad_and_the_figures {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=0;
            String q="SQUARE";
            for (int i=0;i<n;i++){
                String s=sc.next();
                if (k==0&&s.contains("1"))k=s.length()-s.replace("1","").length();
                if (s.contains("1")&&s.length()-s.replace("1","").length()!=k)q="TRIANGLE";
            }
            System.out.println(q);
        }
    }
}
