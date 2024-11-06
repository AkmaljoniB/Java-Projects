package LeetCode;

public class Add_digits {
    public int addDigits(int num) {
        while (num>=10){
            int s=0;
            String a= String.valueOf(num);
            for (int i = 0 ;i<a.length();i++){
                s+=Integer.parseInt(a.substring(i,i+1));
            }
            num=s;
        }
        return num;
    }
}
