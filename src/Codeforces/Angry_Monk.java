package Codeforces;

import java.util.*;

public class Angry_Monk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),l=0,max=0;
            for(int i=0;i<k;i++){
                int a=sc.nextInt();
                l+=a-1+a;
                max=Math.max(max,a);
            }
            System.out.println(l-2*max+1);
        }
    }
}