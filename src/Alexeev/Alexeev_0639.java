package Alexeev;

import java.util.*;

public class Alexeev_0639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Map<Double, LinkedList<String>> map = new TreeMap<>();
        int sum = 0;
        while (t-- > 0) {
            int n = scanner.nextInt();
            sum += n;
            while (n-- > 0) {
                String b = scanner.next();
                double a = Double.parseDouble(b);
                String s = scanner.next();
                if (!map.containsKey(a))map.put(a,new LinkedList<>());
                map.get(a).add(s);
            }
        }
        Double[]arr =new Double[map.size()];
        System.out.println(sum);
        int i =0;
        for (Map.Entry<Double, LinkedList<String>> entry : map.entrySet()) {
            arr[i]=entry.getKey();
            i++;
        }
        for (int j = arr.length-1; j >=0 ; j--) {
            for (int k = 0; k < map.get(arr[j]).size(); k++) {
                String p = String.format("%.2f",arr[j]).replace(",",".");
                System.out.println(p+" "+map.get(arr[j]).get(k));
            }
        }
    }
}
