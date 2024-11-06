package Codeforces;

import java.util.Scanner;

public class Entertainment_in_the_center {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            if (!s.contentEquals(sb)) {
                for (int i = 0; i < n/2; i++) {
                    if (s.charAt(i) > s.charAt(s.length() - 1 - i)) {
                        s = sb + s;
                        break;
                    } else if (s.charAt(i) < s.charAt(s.length() - 1 - i)) break;
                }
            }
            System.out.println(s);
        }
    }
}