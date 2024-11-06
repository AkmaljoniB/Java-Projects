package Codeforces;

import java.util.Scanner;

public class Universal_solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            StringBuilder sb=new StringBuilder();
            int l1=s.length()-s.replace("R","").length(),l2=s.length()-s.replace("P","").length(),l3=s.length()-l1-l2;
            if (l1>=l2&&l1>=l3)sb.append("P".repeat(s.length()));
            else if (l2>=l1&&l2>=l3)sb.append("S".repeat(s.length()));
            else sb.append("R".repeat(s.length()));
            System.out.println(sb);
        }
    }
}