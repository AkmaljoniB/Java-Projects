package Codingbat.Array_2;

public class FizzArray2 {
    public String[] fizzArray2(int n) {
        String[]arr = new String[n];
        for (int i = 0; i < n;i++){
            arr[i]= String.valueOf(i);
        }
        return arr;
    }
}
