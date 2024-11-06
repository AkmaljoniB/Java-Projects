package Codeforces;

import java.util.Scanner;

public class Binary_path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=0,i=0;
            String s1=sc.next(),s2=sc.next();
            StringBuilder sb = new StringBuilder(s1.charAt(0)+"");
            for (;i<n-1;i++) {
                if(s1.charAt(i+1)=='0' && s2.charAt(i)=='1'){
                    sb.append("0");
                    k=0;
                } else if(s1.charAt(i+1)=='1' && s2.charAt(i)=='0'){
                    sb.append("0");
                    i++;
                    break;
                } else{
                    sb.append(s2.charAt(i));
                    k++;
                }
            }
            sb.append(s2.substring(i));
            System.out.println(sb+"\n"+ (k+1));
        }
    }
}
