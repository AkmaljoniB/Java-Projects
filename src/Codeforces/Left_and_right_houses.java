package Codeforces;

import java.util.Scanner;

public class Left_and_right_houses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=n/2,p=0;
            String s=sc.next();
            int p1=s.replace("0","").length(),p2=s.length()-p1;
            int w1=s.substring(0,l).replace("0","").length(),w2=l-w1;
            int w3=s.substring(l).replace("0","").length(),w4=s.length()-l-w3;
            for(int j=0;j<=(n+1)/2;j++) {
                if (w3>=w4&&p1-w3<=p2-w4){
                    p=l-j;
                    if(s.length()%2!=0&&w2>=w1&&p1-w1>=p2-w2)p=l+j;
                    break;
                }
                if(w2>=w1&&p1-w1>=p2-w2){
                    p=l+j;
                    break;
                }
                if (l+j<n) {
                    if (s.charAt(l+j)=='0')w2++;
                    else w1++;
                }
                if(l-j-1>=0){
                    if (s.charAt(l-j-1)=='0')w4++;
                    else w3++;
                }
             }
            System.out.println(p);
        }
    }
}
//        00100