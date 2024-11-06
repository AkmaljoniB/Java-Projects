package Codeforces;

import java.util.Scanner;

public class Marin_and_photo_shoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=0,l=0;
            String s=sc.next();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    if (l>0)k+=l;
                    l=2;
                }else l--;
            }
            System.out.println(k);
        }
    }
}