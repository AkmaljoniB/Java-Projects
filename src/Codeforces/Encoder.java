package Codeforces;

import java.util.Scanner;

public class Encoder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=0,k=0;
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                if (l==0){
                    if (j%2==0){
                        sb.append("C");k++;
                    } else sb.append(".");
                }else {
                    if (j%2!=0){
                        sb.append("C");k++;
                    }else sb.append(".");
                }
            }
            sb.append("\n");
            l^=1;
        }
        System.out.println(k);
        System.out.println(sb);
    }
}