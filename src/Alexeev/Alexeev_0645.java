package Alexeev;

import java.util.Scanner;

public class Alexeev_0645 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(),h=1,w=1,min=k;
        for(int i=1;i<=Math.sqrt(k);i++){
            for(int j=i;j<=k;j++){
                if(i*j>k)break;
                if(min>j-i+k-i*j){
                    min=j-i+k-i*j;
                    h=i;
                    w=j;
                }
            }
        }
        System.out.println(h + " " + w);
    }
}
