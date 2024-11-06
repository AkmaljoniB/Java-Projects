package Alexeev;

import java.util.*;

public class Alexeev_0670 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt(),k=0,i=0;
        while (k!=n){
            i++;
            String s=i+"";
            Set<String> set =new HashSet<>();
            for (int j=0;j<s.length();j++)set.add(s.substring(j,j+1));
            if (s.length()==set.size())k++;
        }
        System.out.println(i);
    }
}
