package Codeforces;

import java.util.*;

public class Sorting_1996C{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),q=sc.nextInt();
            String a=sc.next(),b=sc.next();
            int[][]nums1=new int[n+1][26],nums2=new int[n+1][26];
            for(int i=1;i<=n;i++){
                for(int j=0;j<26;j++){
                    nums1[i][j]=nums1[i-1][j];
                    nums2[i][j]=nums2[i-1][j];
                }
                nums1[i][a.charAt(i-1)-'a']++;
                nums2[i][b.charAt(i-1)-'a']++;
            }
            while(q-->0){
                int l=sc.nextInt(),r=sc.nextInt();
                int len=r-l+1;
                for(int i=0;i<26;i++){
                    len-=Math.min(nums1[r][i]-nums1[l-1][i],nums2[r][i]-nums2[l-1][i]);
                }
                System.out.println(len);
            }
        }
    }
}