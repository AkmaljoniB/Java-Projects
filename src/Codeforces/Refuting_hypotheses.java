package Codeforces;

import java.util.Scanner;

public class Refuting_hypotheses {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long l=s.nextLong(),r=s.nextLong();
        String p="-1";
        if(l%2== 0&&r-l>1)p=l+" "+(l+1)+" "+(l + 2);
        else if(r-l>2)p=(l+1)+" "+(l+2)+" "+(l+3);
        System.out.println(p);
    }
}
