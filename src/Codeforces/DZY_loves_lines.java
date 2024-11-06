package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class DZY_loves_lines {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt(),res=0;
        int[]arr=new int[26];
        for(int i=0;i<26;i++)arr[i]=sc.nextInt();
        for(int i=0;i<s.length();i++)res+=(i+1)*arr[s.charAt(i)-'a'];
        Arrays.sort(arr);
        for(int i=1;i<=k;i++)res+=(i+s.length())*arr[25];
        System.out.println(res);
    }
}