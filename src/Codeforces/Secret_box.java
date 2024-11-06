package Codeforces;

import java.util.Scanner;

public class Secret_box{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
            long k=sc.nextLong(),max=0;
            for(long i=1;i<=x;i++){
                for(long j=1;j<=y;j++){
                    if(k%(i*j)==0&&(k/(i*j))<=z)max=Math.max(max,(x-i+1)*(y-j+1)*(z-(k/(i*j))+1));
                }
            }
            System.out.println(max);
        }
    }
}