package Codeforces;

import java.util.Scanner;

public class Rearrange_the_numbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[10];
        String a=sc.next(),b=sc.next(),r="";
        for(int i=0;i<a.length();i++)arr[a.charAt(i)-'0']++;
        if(b.length()==a.length()){
            out:for(int i=0;i<a.length();i++){
                if(arr[b.charAt(i)-'0']!=0){
                    if(i!=a.length()-1){
                        int k=0;
                        for(int j=b.charAt(i+1)-'0';j>=0;j--){
                            if((j!=b.charAt(i)-'0'&&arr[j]!=0)||(arr[j]>1)){
                                k++;
                                break;
                            }
                        }
                        if(k==0){
                            while(true){
                                for(int j=b.charAt(i)-'0'-1;j>=0;j--){
                                    if(arr[j]!=0){
                                        r=r+j;
                                        arr[j]--;
                                        break out;
                                    }
                                }
                                i--;
                                arr[b.charAt(i)-'0']++;
                                r=r.substring(0,r.length()-1);
                            }
                        }else{
                            r=r+b.charAt(i);
                            arr[b.charAt(i)-'0']--;
                        }
                    }else{
                        r=r+b.charAt(i);
                        arr[b.charAt(i)-'0']--;
                    }
                }else{
                    for(int j=b.charAt(i)-'0';j>=0;j--){
                        if(arr[j]!=0){
                            r=r+j;
                            arr[j]--;
                            break out;
                        }
                    }
                }
            }
        }
        for(int j=9;j>=0;j--){
            for(int o=0;o<arr[j];o++)r=r+j;
        }
        System.out.println(r);
    }
}
