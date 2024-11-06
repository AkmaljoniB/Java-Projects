package Codeforces;

import java.util.*;

public class Modulo_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),arr[]=new int[m];
        String s="No";
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            for(int j=0;j<m;j++){
                if(arr[j]!=0&&arr[j]!=i&&arr[(j+a)%m]==0)arr[(j+a)%m]=i;
            }
            arr[a%m]=i;
            if(arr[0]>0){
                s="YES";
                break;
            }
        }
        System.out.println(s);
    }
}