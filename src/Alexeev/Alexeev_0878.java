package Alexeev;

import java.util.*;

public class Alexeev_0878 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p= scanner.next();
        int[][]arr=new int[26][2];
        for (int i =0;i<26;i++){
            arr[i][0]=p.charAt(i)-'A';
            arr[i][1]=i+1;
        }
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
        String s="YES\n";
        for (int i=0;i<26;i++){
            if (arr[i][0]<i){
                s="NO";
                break;
            }else s=s.concat(arr[i][1]+" ");
        }
        System.out.println(s);
    }
}