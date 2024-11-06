package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Ciel_and_flowers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={sc.nextInt(),sc.nextInt(),sc.nextInt()};
        Arrays.sort(arr);
        int k=(arr[2]-arr[0])/3+(arr[1]-arr[0])/3+arr[0],l=(arr[2]-arr[0]+1)/3+(arr[1]-arr[0]+1)/3+arr[0]-1,p=(arr[2]-arr[0]+2)/3+(arr[1]-arr[0]+2)/3+arr[0]-2;
        if((arr[2]-arr[0]+1)%3!=0&&(arr[1]-arr[0]+1)%3!=0)l++;
        p+=Math.min((arr[2]-arr[0]+2)%3,Math.min((arr[1]-arr[0]+2)%3,2));
        if(arr[0]>0)k=Math.max(k,l);
        if(arr[0]>1)k=Math.max(k,p);
        System.out.println(k);
    }
}