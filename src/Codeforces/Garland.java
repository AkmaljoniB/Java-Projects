package Codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Garland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            String s = scanner.next();
            Set<String > set=new LinkedHashSet<>();
            set.add(s.substring(0,1));
            set.add(s.substring(1,2));
            set.add(s.substring(2,3));
            set.add(s.substring(3,4));
            if (set.size()>2) System.out.println(4);
            else if (set.size()==2){
                if (s.replace(s.substring(0,1),"").length()==2) System.out.println(4);
                else System.out.println(6);
            }
            else System.out.println(-1);

        }
    }
}
