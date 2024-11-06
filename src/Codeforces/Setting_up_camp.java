package Codeforces;

import java.util.Scanner;

public class Setting_up_camp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            System.out.println(b%3==0||c+b%3>=3?(b+c)%3==0?a+(b+c)/3:a+(b+c)/3+1:-1);
        }
    }
}
