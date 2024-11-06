package Codeforces;

import java.util.Scanner;

public class Game_of_Vasya_and_Petya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=0;
        StringBuilder sb=new StringBuilder();
        for(int i=2;i<=n;i++){
            int l=1;
            String s="YES";
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    s="NO";
                    break;
                }
            }
            if(s.equals("YES")){
                while((i%2!=0||i==2)&&Math.pow(i,l)<=n){
                    sb.append((int)Math.pow(i,l)+" ");
                    l++;
                    k++;
                }
            }
        }
        System.out.println(k);
        System.out.println(sb);
    }
}