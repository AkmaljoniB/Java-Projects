package Codeforces;

import java.util.*;

public class Subscript_sorting{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n],s="YES";
        for(int i=0;i<n;i++)arr[i]=sc.next();
        Arrays.sort(arr,Comparator.comparingInt(String::length));
        for(int i=1;i<n;i++){
            if(!arr[i].contains(arr[i-1])){
                s="NO";
                break;
            }
        }
        System.out.println(s);
        if(s.length()==3)for(int i=0;i<n;i++)System.out.println(arr[i]);
    }
}