package LeetCode测试.数组字符串;

import java.util.Arrays;

public class 反转字符串中的单词 {
    public static void main(String[] args) {

        String s = "a good   example";

        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {

        String[] str = s.trim().split("\\s+");
        StringBuilder temp = new StringBuilder();

        for (int i = str.length-1; i >= 0; i--) {
            temp.append(str[i]);
            if(i != 0){
                temp.append(" ");
            }
        }

        return temp.toString();

    }
}
