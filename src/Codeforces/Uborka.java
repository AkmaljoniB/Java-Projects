package Codeforces;
import java.util.*;
import java.io.*;
public class Uborka {
    static long[] mods = {1000000007, 998244353, 1000000009};
    static long mod = mods[0];
    public static MyScanner sc;
    public static PrintWriter out;
    public static void main(String[] omkar) throws Exception{
        // TODO Auto-generated method stub
        sc = new MyScanner();
        out = new PrintWriter(System.out);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            long[] arr = readArrayLong(n);
            long[] prefix = new long[n];
            prefix[0] = arr[0];
            long[] suffix = new long[n];
            suffix[n-1] = arr[n-1];
            boolean[] prefixb = new boolean[n];
            prefixb[0] = true;
            boolean[] suffixb = new boolean[n];
            suffixb[n-1] = true;
            for(int j = 1;j<n;j++){
                prefix[j] = arr[j]-prefix[j-1];
                if (prefix[j] >=0)
                    prefixb[j] = prefixb[j-1];
                else
                    prefixb[j] = false;
            }
            for(int j = n-2;j>=0;j--){
                suffix[j] = arr[j]-suffix[j+1];
                if (suffix[j] >=0)
                    suffixb[j] = suffixb[j+1];
                else
                    suffixb[j] = false;
            }
            boolean found = false;
            for(int j = 0;j<n-1;j++){
                if (prefixb[j] && suffixb[j+1] && prefix[j] == suffix[j+1])
                    found = true;
            }
            for(int j = 0;j<n-1;j++){
                if ((j-1 < 0 || prefixb[j-1]) && (j+2 >= n || suffixb[j+2])){
                    if (arr[j+1]-(j-1 < 0 ? 0 : prefix[j-1]) == arr[j]-(j+2 >= n ? 0 : suffix[j+2])){
                        if (arr[j]-(j+2 >= n ? 0 : suffix[j+2]) >=0)
                            found = true;
                    }
                }
            }
            verdict(found);


        }

        out.close();
    }
    public static void sort(int[] array){
        ArrayList<Integer> copy = new ArrayList<>();
        for (int i : array)
            copy.add(i);
        Collections.sort(copy);
        for(int i = 0;i<array.length;i++)
            array[i] = copy.get(i);
    }
    static String[] readArrayString(int n){
        String[] array = new String[n];
        for(int j =0 ;j<n;j++)
            array[j] = sc.next();
        return array;
    }
    static int[] readArrayInt(int n){
        int[] array = new int[n];
        for(int j = 0;j<n;j++)
            array[j] = sc.nextInt();
        return array;
    }
    static int[] readArrayInt1(int n){
        int[] array = new int[n+1];
        for(int j = 1;j<=n;j++){
            array[j] = sc.nextInt();
        }
        return array;
    }
    static long[] readArrayLong(int n){
        long[] array = new long[n];
        for(int j =0 ;j<n;j++)
            array[j] = sc.nextLong();
        return array;
    }
    static double[] readArrayDouble(int n){
        double[] array = new double[n];
        for(int j =0 ;j<n;j++)
            array[j] = sc.nextDouble();
        return array;
    }
    static int minIndex(int[] array){
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int j = 0;j<array.length;j++){
            if (array[j] < minValue){
                minValue = array[j];
                minIndex = j;
            }
        }
        return minIndex;
    }
    static int minIndex(long[] array){
        long minValue = Long.MAX_VALUE;
        int minIndex = -1;
        for(int j = 0;j<array.length;j++){
            if (array[j] < minValue){
                minValue = array[j];
                minIndex = j;
            }
        }
        return minIndex;
    }
    static int minIndex(double[] array){
        double minValue = Double.MAX_VALUE;
        int minIndex = -1;
        for(int j = 0;j<array.length;j++){
            if (array[j] < minValue){
                minValue = array[j];
                minIndex = j;
            }
        }
        return minIndex;
    }
    static long power(long x, long y){
        if (y == 0)
            return 1;
        if (y%2 == 1)
            return (x*power(x, y-1))%mod;
        return power((x*x)%mod, y/2)%mod;
    }
    static void verdict(boolean a){
        out.println(a ? "YES" : "NO");
    }
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try{
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

//StringJoiner sj = new StringJoiner(" ");
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is