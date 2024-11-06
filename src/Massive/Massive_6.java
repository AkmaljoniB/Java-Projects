package Massive;

public class Massive_6 {
    public static void main(String[] args) {
        int[] arr = {3,5,20,7,3,100,6,-7,9,17};
        printOddNumber(arr);
    }

    private static void printOddNumber(int[] arr) {
        StringBuilder str  = new StringBuilder();
        for (int i : arr){
            if (i %2 !=0){
                str.append(", "+i);
            }
        }
        System.out.println(str.deleteCharAt(0));
    }
}
