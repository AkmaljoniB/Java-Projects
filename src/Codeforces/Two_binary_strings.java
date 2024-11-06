package Codeforces;

import java.util.Scanner;

public class Two_binary_strings{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next(),b=sc.next(),p="NO";
            int l=a.charAt(0),r=b.charAt(b.length()-1);
            if(a.charAt(0)==b.charAt(0)&&a.charAt(a.length()-1)==b.charAt(b.length()-1)){
                if(l==r)p="YES";
                else{
                    for(int i=0;i<a.length()-1;i++){
                        if(a.charAt(i)==b.charAt(i)&&a.charAt(i)==l&&a.charAt(i+1)==b.charAt(i+1)&&a.charAt(i+1)==r){
                            p="YES";
                            break;
                        }
                    }
                }
            }
            System.out.println(p);
        }
    }
}