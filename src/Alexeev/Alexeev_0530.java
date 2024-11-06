package Alexeev;

import java.util.Scanner;

public class Alexeev_0530{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt(),h=sc.nextInt();
        char[][]a=new char[h][w],b=new char[h][w];
        for(int i=0;i<h;i++)a[i]=sc.next().toCharArray();
        for(int i=0;i<h;i++)b[i]=sc.next().toCharArray();
        char[]arr=sc.next().toCharArray();
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(a[i][j]==b[i][j]&&a[i][j]=='1')System.out.print(arr[3]);
                else if(a[i][j]==b[i][j]&&a[i][j]=='0')System.out.print(arr[0]);
                else if(a[i][j]=='0')System.out.print(arr[1]);
                else System.out.print(arr[2]);
            }
            System.out.println();
        }
    }
}