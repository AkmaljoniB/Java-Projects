package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Formirovanie_komand {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] ars = br.readLine().split(" ");
        int[]arr = new int[ars.length];
        int s=0;
        for (int i = 0 ; i <ars.length;i++){
            arr[i]= Integer.parseInt(ars[i]);
        }
        Arrays.sort(arr);
        for (int i = 0 ; i <arr.length;i+=2){
            s+=arr[i+1]-arr[i];
        }
        System.out.println(s);
    }
}