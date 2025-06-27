package LeetCode测试.哈希表;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 快乐数 {
    public static void main(String[] args) {

        System.out.println(isHappy(19));

    }

    public static boolean isHappy(int n) {

        if(n < 10) {
            return false;
        }

        int a = 0;

        while(true) {
            List<Integer> temp = splitDigits(n);
            for (int i = 0; i < temp.size(); i++) {
                a += (temp.get(i) * temp.get(i));
            }

            if(a == 1) {
                return true;
            } else {
                n = a;
            }
        }
    }

    public static List<Integer> splitDigits(int number) {

        List<Integer> digits = new ArrayList<>();

        while(number > 0) {
            int digit = number % 10;
            digits.add(digit);
            number/=10;

        }

        //反转
        Collections.reverse(digits);
        return digits;
    }
}
