package Codeforces;

import java.util.Scanner;

public class Binary_coloring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            StringBuilder sb=new StringBuilder();
            int x=sc.nextInt(),l=0,s1=0,s2=0;
            while(Math.pow(2,l+1)<=x){
                if(l%2==0)s1+=Math.pow(2,l);
                else s2+=Math.pow(2,l);
                l++;
            }
            if(l%2==0&&Math.pow(2,l)+s1<x)l++;
            else if(l%2!=0&&Math.pow(2,l)+s2<x)l++;
            int[]arr=new int[l+1];
            sb.append(l+1 +"\n");
            arr[l]=1;
            x=(int)(Math.pow(2,l)-x);



            for(int i=0;i<=l;i++)sb.append(arr[i]+" ");
            System.out.println(sb);
        }
    }
}
//1 - 1
//3 - -1 4
//4 - 4
//5 - 1 4
//6 - -2 8
//7 - -1 8
//8 - 8
//9 - 1 8
//10 - 2 8
//11 - 16 -4 -1
//12 - 16 -4
//13 - 16 -4 1
//14 - 16 -2
//15 - 16 -1
//16 - 16
//17 - 16 1
//18 - 16 2
//19 - 16 4 -1
//20 - 16 4
//21 - 16 4 1
//22 - 32 -8 -2
//23 - 32 -8 -1
//24 - 32 -8
//25 - 32 -8 1
//26 - 32 -8 2
//27 - 32 -4 -1
//1 2 4 8 16 32 64 128