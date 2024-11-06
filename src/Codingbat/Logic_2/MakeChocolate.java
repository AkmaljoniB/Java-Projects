package Codingbat.Logic_2;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        while (big > 0 && goal >= 5) {
            goal -= 5;
            big--;
        }
        if (goal <= small) {
            return goal;
        } else {
            return -1;
        }
    }
}

