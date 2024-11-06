package Codeforces;

import java.util.Scanner;

public class Buying_a_house {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt()-1,k=sc.nextInt(),l=0;
        int[]arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        for(int i=1;i<n;i++){
            if(m-i>=0&&arr[m-i]!=0&&arr[m-i]<=k){
                l=(m-(m-i))*10;
                break;
            }else if(m+i<n&&arr[m+i]!=0&&arr[m+i]<=k){
                l=((m+i)-m)*10;
                break;
            }
        }
        System.out.println(l);
    }
}