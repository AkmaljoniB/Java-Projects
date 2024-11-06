package Codeforces;

import java.util.Scanner;

public class Create_three_regions {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=0;
            char[][]arr=new char[2][n];
            arr[0]=sc.next().toCharArray();
            arr[1]=sc.next().toCharArray();
            for(int i=1;i<n-1;i++){
                if(arr[0][i]=='.'&&func(arr,0,i))k++;
                if(arr[1][i]=='.'&&func(arr,1,i))k++;
            }
            System.out.println(k);
        }
    }
    static boolean func(char[][]arr,int i,int j){
        if(arr[i][j-1]=='x'&&arr[i][j+1]=='x'){
            return arr[1-i][j-1]=='.'&&arr[1-i][j+1]=='.';
        }
        return false;
    }
}