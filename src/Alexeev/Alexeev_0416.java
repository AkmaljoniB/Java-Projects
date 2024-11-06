package Alexeev;

import java.util.Scanner;

public class Alexeev_0416 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        String a="abcdefgh";
        int k = Integer.parseInt(s.substring(1,2)),l=a.indexOf(s);
        s=s.substring(0,1);
        if (l>1){
            if (k>1) System.out.println(a.charAt(l-2)+""+(k-1));
            if (k<8) System.out.println(a.charAt(l-2)+""+(k+1));
        }
        if (l>0){
            if (k>2) System.out.println(a.charAt(l-1)+""+(k-2));
            if (k<7) System.out.println(a.charAt(l-1)+""+(k+2));
        }
        if (l<7){
            if (k>2) System.out.println(a.charAt(l+1)+""+(k-2));
            if (k<7) System.out.println(a.charAt(l+1)+""+(k+2));
        }
        if (l<6){
            if (k>1) System.out.println(a.charAt(l+2)+""+(k-1));
            if (k<8) System.out.println(a.charAt(l+2)+""+(k+1));
        }
    }
}
