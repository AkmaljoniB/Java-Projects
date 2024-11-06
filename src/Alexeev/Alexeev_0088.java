package Alexeev;

import java.util.*;

public class Alexeev_0088{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=(int)Math.pow(sc.nextInt(),2),p=(int)Math.sqrt(n);
        int[][]arr=new int[n][n];
        String s="Correct";
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)arr[i][j]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            Set<Integer>a=new HashSet<>(),b=new HashSet<>();
            int m1=0,min1=n;
            for(int j=0;j<n;j++){
                m1=Math.max(m1,Math.max(arr[i][j],arr[j][i]));
                min1=Math.min(min1,Math.min(arr[i][j],arr[j][i]));
                a.add(arr[i][j]);
                b.add(arr[j][i]);
            }
            if(a.size()!=n||min1!=1||m1!=n||b.size()!=n){
                s="Incorrect";
                break;
            }
        }
        for(int i=0;i<n;i+=3){
            Set<Integer>a=new HashSet<>();
            for(int j=i;j<p+i;j++){
                for(int k=i;k<p+i;k++)a.add(arr[j][k]);
            }
            if(a.size()!=n){
                s="Incorrect";
                break;
            }
        }
        System.out.println(s);
    }
}
