package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diverse_team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(scanner.nextInt(), i);
        }
        if (map.size()>=k){
            System.out.println("YES");
            for (Map.Entry<Integer,Integer>entry:map.entrySet()){
                k--;
                System.out.println(entry.getValue()+1);
                if (k==0)break;
            }
        } else System.out.println("NO");
    }
}
