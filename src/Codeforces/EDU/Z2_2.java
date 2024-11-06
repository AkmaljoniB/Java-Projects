package Codeforces.EDU;

import java.util.Scanner;

public class Z2_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int k=sc.nextInt(),j=sc.nextInt();
            int i=0,r=(int)(Math.pow(2,k)-1);
            int[]arr=new int[26];
            arr[0]=2;
            String s="a";
            char a='a';
            while(j!=0&&j+i<r){
                int q=s.charAt(i)=='a'?0:arr[s.charAt(i)-'a'-1]-1;
                if((j+i-q)%arr[s.charAt(i)-'a']!=0)break;
                if(s.charAt(i)==a){
                    a++;
                    s=s+a+s;
                    arr[a-'a']=s.length()+1;
                }
                i++;
            }
            System.out.println(i);
        }
    }
}