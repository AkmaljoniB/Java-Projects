package Codeforces;

import java.util.*;

public class Presentation_coordination_simple_version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),q=sc.nextInt(),l=0;
            int[]a=new int[n],b=new int[m];
            String s="YA";
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            for(int i=0;i<m;i++)b[i]=sc.nextInt();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<m&&l<n;i++){
                if(a[l]==b[i]){
                    list.add(a[l]);
                    l++;
                }else if(!list.contains(b[i])&&(l==0||b[i]!=a[l-1])){
                    s="TIDAK";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}