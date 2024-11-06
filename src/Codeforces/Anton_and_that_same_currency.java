package Codeforces;

import java.util.*;

public class Anton_and_that_same_currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int[][]arr=new int[5][2];
        for (int i=0;i<=8;i+=2){
            arr[i/2][0]=s.lastIndexOf(i+"");
            arr[i/2][1]=i;
        }
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
        if (arr[4][0]!=-1){
            int a= Integer.parseInt(s.substring(s.length()-1));
            int p=arr[4][1],l=arr[4][0];
            for (int i=4;i>=0;i--) {
                if (arr[i][0]!=-1){
                    if(a>arr[i][1]&&l>s.indexOf(arr[i][1]+"")){
                        p=arr[i][1];
                        l=s.indexOf(arr[i][1]+"");
                    }
                }else break;
            }
            s=s.substring(0,s.length()-1)+p;
            s=s.substring(0,l)+a+s.substring(l+1);
        } else s="-1";
        System.out.println(s);
    }
}
