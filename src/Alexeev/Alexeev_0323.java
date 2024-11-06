package Alexeev;

import java.util.Scanner;

public class Alexeev_0323{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<n;i++){
            int l=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    l++;
                    break;
                }
            }
            if(l==0){
                for(int j=2;j<=(n-i)/2;j++){
                    if((n-i)%j==0){
                        l++;
                        break;
                    }
                }
            }
            if(l==0){
                System.out.print(i+" "+(n-i));
                break;
            }
        }
    }
}