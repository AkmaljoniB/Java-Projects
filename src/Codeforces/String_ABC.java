package Codeforces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class String_ABC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            String[][]arr=new String[3][2];
            arr[0][0]="A";
            arr[0][1]=s.length()-s.replace("A","").length()+"";
            arr[1][0]="B";
            arr[1][1]=s.length()-s.replace("B","").length()+"";
            arr[2][0]="C";
            arr[2][1]=s.length()-s.replace("C","").length()+"";
            Arrays.sort(arr, Comparator.comparingInt(a-> Integer.parseInt(a[1])));
            if (Integer.parseInt(arr[0][1])+Integer.parseInt(arr[1][1])==Integer.parseInt(arr[2][1])){
                if (!arr[2][0].equals(s.charAt(0)+"")&&!arr[2][0].equals(s.charAt(s.length()-1)+""))System.out.println("NO");
                else {
                    String p="YES";
                    int k=0;
                    if (arr[2][0].equals(s.charAt(0)+"")){
                        for (int i=0;i<s.length();i++){
                            if (arr[2][0].equals(s.charAt(i)+""))k++;
                            else k--;
                            if (k<0)p="NO";
                        }
                    }else {
                        for (int i=0;i<s.length();i++){
                            if (!arr[2][0].equals(s.charAt(i)+""))k++;
                            else k--;
                            if (k<0)p="NO";
                        }
                    }
                    System.out.println(p);
                }
            }else System.out.println("NO");
        }
    }
}