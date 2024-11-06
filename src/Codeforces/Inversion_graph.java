package Codeforces;

import java.util.Scanner;

public class Inversion_graph{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),max=0,k=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a>max){
                    if(max==i)k++;
                    max=a;
                }
            }
            System.out.println(k);
        }
    }
}