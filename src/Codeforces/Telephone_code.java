package Codeforces;

import java.util.Scanner;

public class Telephone_code{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[]arr=new String[n];
        for(int i=0;i<n;i++)arr[i]=sc.next();
        int l=arr[0].length();
        for(int i=0;i<l;i++){
            for(int j=1;j<n;j++){
                if(arr[j].charAt(i)!=arr[0].charAt(i)){
                    l=i;
                    break;
                }
            }
        }
        System.out.println(l);
    }
}
