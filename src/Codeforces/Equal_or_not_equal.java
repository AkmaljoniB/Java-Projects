package Codeforces;

import java.util.*;

public class Equal_or_not_equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            System.out.println(s.contains("N")&&s.indexOf("N")==s.lastIndexOf("N")?"NO":"YES");
        }
    }
}
