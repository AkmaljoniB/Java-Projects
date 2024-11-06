package Codingbat.Warmup_2;

public class CountXX {
    public static void main(String[] args) {
        System.out.println(countXX("xxx"));
    }
    static int countXX(String str) {
//        int s=-1;
//        char[] charArray = str.toCharArray();
//        for (char element: charArray){
//            if (element == 'x'){
//                s++;
//            }
//        }
//        if (s==-1){
//            return 0;
//        }
//        return s;
        int s = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+2).equals("xx")){
                s++;
            }
            if (i+2==str.length()){
                break;
            }
        }
        return s;
    }
}
