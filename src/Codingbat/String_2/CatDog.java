package Codingbat.String_2;

public class CatDog {
    public boolean catDog(String str) {
        int a = 0, b =0;
        if (str.length()<3){
            return true;
        }
        for (int i = 0; i < str.length();i++){
            if (str.length()-2==i){
                break;
            }
            if (str.substring(i,i+3).equals("cat")){
                a++;
            }
            if (str.substring(i,i+3).equals("dog")){
                b++;
            }
        }
        if (a==b){
            return true;
        }
        return false;
    }
}
