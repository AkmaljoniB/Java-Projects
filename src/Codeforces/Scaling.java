package Codeforces;

import java.util.*;

public class Scaling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,k=0;
            for(int i=0;i<n*2;i++){
                for(int j=0;j<n;j++)System.out.print(j%2==l ? "##" : "..");
                k++;
                if(k==2){
                    l=1-l;
                    k=0;
                }
                System.out.println();
            }
        }
    }
}
