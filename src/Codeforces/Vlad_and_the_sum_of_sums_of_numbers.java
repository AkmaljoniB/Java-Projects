package Codeforces;

import java.util.Scanner;

public class Vlad_and_the_sum_of_sums_of_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=n+"",f="1000000000";
            long sum=0;
            for (int i=1;i<s.length();i++)sum+=45;
            sum*=Integer.parseInt(f.substring(0,s.length()-1));
            System.out.println(sum);
        }
    }
}
//45 55 65 75 85 95 105
//45    1 2 3 4 5 6 7 8 9
//55    1 2 3 4 5 6 7 8 9 10
//65    2 3 4 5 6 7 8 9 10 11
//75    3 4 5 6 7 8 9 10 11 12
//85    4 5 6 7 8 9 10 11 12 13
//95    5 6 7 8 9 10 11 12 13 14
//105   6 7 8 9 10 11 12 13 14 15
//115   7 8 9 10 11 12 13 14 15 16
//125   8 9 10 11 12 13 14 15 16 17
//135   9 10 11 12 13 14 15 16 17 18
//55    1 2 3 4 5 6 7 8 9 10
//65    2 3 4 5 6 7 8 9 10 11
//99   900
//199  1000
//299  1100