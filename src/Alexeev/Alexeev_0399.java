package Alexeev;

import java.util.*;

public class Alexeev_0399{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),x=1,y=1,px=0,py=1,k=0;
        int[][]arr=new int[n][m];
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            for(int j=0;j<m;j++)if(s.charAt(j)=='@')arr[i][j]=-1;
        }
        while(x!=n-2||y!=m-2){
            int min=Integer.MAX_VALUE;
            if(arr[x-1][y]!=-1)min=arr[x-1][y];
            if(arr[x+1][y]!=-1)min=Math.min(min,arr[x+1][y]);
            if(arr[x][y-1]!=-1)min=Math.min(min,arr[x][y-1]);
            if(arr[x][y+1]!=-1)min=Math.min(min,arr[x][y+1]);
            arr[x][y]++;
            if(arr[2*x-px][2*y-py]==min){
                int q=x,w=y;
                x=2*x-px;
                y=2*y-py;
                px=q;
                py=w;
            }else{
                px=x;
                py=y;
                if(arr[x+1][y]==min)x++;
                else if(arr[x][y+1]==min)y++;
                else if(arr[x-1][y]==min)x--;
                else if(arr[x][y-1]==min)y--;
                else{
                    k=-1;
                    break;
                }
            }
            k++;
            if(k>10000001){
                k=-1;
                break;
            }
        }
        System.out.println(k);
    }
}