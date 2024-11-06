package Codeforces;

import java.util.Scanner;

public class Bus_to_Penjamo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),r=sc.nextInt(),l=0,s=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                l+=a-a%2;
                s+=a%2;
            }
            if(s>=(r-l/2))l+=(r-l/2)-(s-(r-l/2));
            else l+=s;
            System.out.println(l);
        }
    }
}
