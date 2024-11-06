package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_the_corner{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            char[][]a=new char[n][m],b=new char[n][m];
            for(int i=0;i<n;i++)a[i]=sc.next().toCharArray();
            for(int i=0;i<n;i++)b[i]=sc.next().toCharArray();
            for(int i=0;i<n-1;i++){
                for(int j=0;j<m-1;j++){
                    int l=0;
                    if(a[i][j]-b[i][j]==1||b[i][j]-a[i][j]==2)l=2;
                    else if(a[i][j]-b[i][j]==2||b[i][j]-a[i][j]==1)l=1;
                    a[i][j]=b[i][j];
                    a[i+1][j+1]=(char)((((a[i+1][j+1]-'0')+l)%3)+'0');
                    a[i][j+1]=(char)((((a[i][j+1]-'0')+3-l)%3)+'0');
                    a[i+1][j]=(char)((((a[i+1][j]-'0')+3-l)%3)+'0');
                }
            }
            System.out.println(Arrays.deepEquals(a,b)?"Yes":"No");
        }
    }
}