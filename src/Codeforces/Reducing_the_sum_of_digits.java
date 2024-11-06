package Codeforces;

import java.util.Scanner;

public class Reducing_the_sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String p=sc.next();
            int n=p.length()+1,sum=0,l=1;
            char[]arr=new char[n];
            arr[0]='0';
            for(int i=1;i<n;i++){
                arr[i]=p.charAt(i-1);
                sum+=arr[i]-'0';
            }
            long s=sc.nextInt(),k=0;
            while (sum>s){
                k+=(long) Math.pow(10,l)-((arr[n-l]-'0')*(long)Math.pow(10,l-1));
                sum-=(arr[n-l]-'0')-1;
                arr[n-l]='0';
                if (arr[n-l-1]-'0'=='9'){
                    arr[n-l-1]='0';
                    arr[n-l-2]++;
                }else arr[n-l-1]++;
                l++;
            }
            System.out.println(k);
        }
    }
}