package Codeforces;

import java.util.Scanner;
import java.util.TreeSet;

public class Even_positions {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),min=0,l=0;
            String s=sc.next();
            TreeSet<Integer>set=new TreeSet<>();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='('||(l==0&&s.charAt(i)=='_')){
                    l++;
                    set.add(i);
                }else{
                    l--;
                    min+=i-set.pollFirst();
                }
            }
            System.out.println(min);
        }
    }
}