package Codeforces;

import java.util.Scanner;

public class Removal_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]a=new int[n],b=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            for(int i=0;i<n;i++)b[i]=sc.nextInt();
            int l=0,r=n-1;
            String s="Bob";
            for(int i=0;i<n;i++){
                if(a[i]==b[l])l++;
                else if(a[i]==b[r])r--;
                else{
                    s="Alice";
                    break;
                }
            }
            if(s.length()==3){
                l=0;r=n-1;
                for(int i=n-1;i>=0;i--){
                    if(a[i]==b[l])l++;
                    else if(a[i]==b[r])r--;
                    else{
                        s="Alice";
                        break;
                    }
                }
            }
            System.out.println(s);
        }
    }
}