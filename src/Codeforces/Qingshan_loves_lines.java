package Codeforces;

import java.util.Scanner;

public class Qingshan_loves_lines{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            sc.nextInt();sc.nextInt();
            String s=sc.next(),q=sc.next();
            System.out.println((!s.contains("11")&&!s.contains("00"))||(!q.contains("11")&&!q.contains("00")&&(!s.contains("11")||(s.contains("11")&&q.startsWith("0")&&q.endsWith("0")))&&(!s.contains("00")||(s.contains("00")&&q.startsWith("1")&&q.endsWith("1"))))?"Yes":"No");
        }
    }
}