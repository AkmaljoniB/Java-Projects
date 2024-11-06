package Codeforces;

import java.util.*;

public class Blue_red_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            String s = sc.next();
            List<Integer>B=new ArrayList<>();
            List<Integer>R=new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'B') B.add(arr[i]);
                else  R.add(arr[i]);
            }
            Collections.sort(B);
            Collections.sort(R);
            s ="YES";
            for (int i = 0; i < B.size(); i++) {
                if (B.get(i)<(i+1)){
                    s="NO";
                    break;
                }
            }
            for (int i = R.size()-1; i >=0; i--) {
                if (R.get(i)>(n-(R.size()-i-1))){
                    s="NO";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
