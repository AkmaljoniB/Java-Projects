package Codeforces;

import java.util.Scanner;

public class Ksyusha_and_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),min=(int)Math.pow(10,9);
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            min=Math.min(min,arr[i]);
        }
        for(int i=0;i<n;i++){
            if(arr[i]%min!=0){
                min=-1;
                break;
            }
        }
        System.out.println(min);
    }
}
