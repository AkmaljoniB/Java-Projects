package Codeforces;

import java.util.Scanner;

public class Delete_on_the_left {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),t=sc.next();
        int i=s.length()-1,j=t.length()-1;
        while (i!=-1&&j!=-1){
            if (t.charAt(j)==s.charAt(i)){
                i--;
                j--;
            }else break;
        }
        System.out.println(i+j+2);
    }
}
