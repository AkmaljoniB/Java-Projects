package Codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Another_broken_keyboars {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n =scanner.nextInt();
        int k =scanner.nextInt();
        String s =scanner.next();
        List<String>list=new LinkedList<>();
        for (int i = 0; i <k ; i++) {
            list.add(scanner.next());
        }
        int  p= 0;
        long sum=0;
        for (int i = 0; i < n; i++) {
            if (list.contains(s.substring(i,i+1))){
                p++;
            } else {
                sum+= (long) (p + 1) *p/2;
                p=0;
            }
        }
        sum+= (long) (p + 1) *p/2;
        System.out.println(sum);
    }
}
