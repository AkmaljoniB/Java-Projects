package Codeforces;

import java.util.Scanner;

public class osu_mania{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String res="";
            for(int i=0;i<n;i++)res=(sc.next().indexOf("#")+1)+" "+res;
            System.out.println(res);
        }
    }
}