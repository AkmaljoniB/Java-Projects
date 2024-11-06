package Codeforces;

import java.util.Scanner;

public class P1512C{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),l=0;
            char[]arr=sc.next().toCharArray();
            int n=arr.length;
            for(int i=0;i<n/2;i++){
                if(arr[i]!=arr[n-i-1]){
                    if(arr[i]=='?'||arr[n-i-1]=='?'){
                        if(arr[i]=='0'||arr[n-i-1]=='0')arr[i]=arr[n-i-1]='0';
                        else arr[i]=arr[n-i-1]='1';
                    }else{
                        l=-1;
                        break;
                    }
                }
                if(arr[i]=='0')a-=2;
                else if(arr[i]=='1')b-=2;
            }
            if(l==0){
            for(int i=0;i<n/2;i++){
                if(arr[i]=='?'){
                    if(a>1){
                        arr[i]=arr[n-i-1]='0';
                        a-=2;
                    }else{
                        arr[i]=arr[n-i-1]='1';
                        b-=2;
                    }
                }
            }
            if(n%2==1){
                if(arr[n/2]=='0')a--;
                else if(arr[n/2]=='1')b--;
                else if(a>0){
                    a--;
                    arr[n/2]='0';
                }else{
                    b--;
                    arr[n/2]='1';
                }
            }
            }
            if(l==0&&a==b&&a==0){
                for(char c:arr)System.out.print(c);
                System.out.println();
            }else System.out.println(-1);
        }
    }
}