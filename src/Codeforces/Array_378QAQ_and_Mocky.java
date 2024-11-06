package Codeforces;

import java.util.*;

public class Array_378QAQ_and_Mocky{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,p=1,c=0;
            Integer[]arr=new Integer[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            for(int i=1;i<n;i++)if(!Objects.equals(arr[i],arr[0])){p=arr[i];break;}
            String s="Yes";
            for(int i=1;i<n;i++){
                if(arr[i]%p!=0&&arr[i]%arr[0]!=0)s="No";
                if(arr[i]%arr[0]!=0){
                    if(arr[i]%arr[c]!=0)l++;
                    if(c==0)c=i;
                }
            }
            System.out.println(s.length()==3||l==1?"Yes":"No");
        }
    }
}