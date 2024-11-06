package Alexeev;

import java.util.Scanner;

public class Alexeev_0665 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        while (true){
            int h =Integer.parseInt(s.substring(0,2));
            int m =Integer.parseInt(s.substring(3,5));
            m+=1;
            h+=m/60;
            h=h%24;
            m=m%60;
            String p = String.valueOf(h);
            if (p.length()==1)p=0+p;
            String f = String.valueOf(m);
            if (f.length()==1)f=0+f;
            StringBuilder sb = new StringBuilder(p);
            sb.reverse();
            if (f.contentEquals(sb)) {
                System.out.println(p+":"+f);
                break;
            }
            s=p+":"+f;
        }
    }
}
