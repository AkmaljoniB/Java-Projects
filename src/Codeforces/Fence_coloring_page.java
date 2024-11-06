package Codeforces;

import java.util.Scanner;

public class Fence_coloring_page{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt(),arr[]=new int[9],min=Integer.MAX_VALUE,j=0;
        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
            if(min>=arr[i]){
                min=arr[i];
                j=i+1;
            }
        }
        StringBuilder sb=new StringBuilder();
        if(v/min<1)sb.append(-1);
        else{
            if(v%min!=0){
                int l=v/min;
                v=v%min;
                for(int i=8;i>=j;i--){
                    if(arr[i]-min<=v){
                        v-=arr[i]-min;
                        sb.append(i+1);
                        i=9;
                        l--;
                    }
                }
                sb.append((j+"").repeat(l));
            }else sb.append((j+"").repeat(v/min));
        }
        System.out.println(sb);
    }
}