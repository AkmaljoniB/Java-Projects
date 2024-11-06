package Codeforces;

import java.util.Scanner;

public class Switch_track {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=1,r=0,d=-1;
            String a=sc.next(),b=sc.next(),p="YES";
            for(int i=0;i<n-1;){
                if (a.charAt(i+l)=='>'){
                    i++;
                    if (l!=0)i++;
                    r=0;
                    l=1;
                } else if (b.charAt(i+r)=='>'){
                    i++;
                    if (r!=0)i++;
                    l=0;
                    r=1;
                }else {
                    if (l==0)l=1;
                    else l=0;
                    if (r==0)r=1;
                    else r=0;
                    if(i!=0){
                        if(d==-1)d=i;
                        else if(d==i){
                            p="NO";
                            break;
                        }
                        i--;
                    }
                }
            }
            System.out.println(p);
        }
    }
}