package Codeforces;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Deletions_with_varying_parity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        List<Integer>j = new LinkedList<>();
        List<Integer>t = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int a =scanner.nextInt();
            if (a%2==0)j.add(a);
            else t.add(a);
        }
        Collections.sort(j);
        Collections.sort(t);
        int min = Math.min(j.size(),t.size());
        int s=0;
        for (int i = 0; i < j.size()-min; i++) s+=j.get(i);
        for (int i = 0; i < t.size()-min; i++) s+=t.get(i);
        if (j.size()!=t.size()){
            if (j.size()==min)s-=t.get(t.size()-min-1);
            else s-=j.get(j.size()-min-1);
        }
        System.out.println(s);
    }
}
