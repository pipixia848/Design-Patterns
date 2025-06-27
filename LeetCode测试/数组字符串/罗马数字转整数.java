package LeetCode测试.数组字符串;

import java.util.HashMap;
import java.util.Map;

public class 罗马数字转整数 {
    public static void main(String[] args) {


        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {

        int target = 0;

        if(s.isEmpty()){
            return target;
        }

        //创建Map对象，来匹配
        Map<Character, Integer> keyValueMap = new HashMap<>();
        keyValueMap.put('I', 1);
        keyValueMap.put('V', 5);
        keyValueMap.put('X', 10);
        keyValueMap.put('L', 50);
        keyValueMap.put('C', 100);
        keyValueMap.put('D', 500);
        keyValueMap.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {


            if(i == s.length() - 1){
                target += keyValueMap.get(s.charAt(i));
                return target;
            }

            if(keyValueMap.get(s.charAt(i)) < keyValueMap.get(s.charAt(i + 1))){
                target += keyValueMap.get(s.charAt(i + 1)) - keyValueMap.get(s.charAt(i));
                i++;
            } else {
                target += keyValueMap.get(s.charAt(i));
            }

        }

        return target;


    }
}
