package LeetCode测试.双指针;

import java.util.Objects;

public class 验证回文串 {
    public static void main(String[] args) {


        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {


        String[] str = s.toLowerCase().replaceAll("[^a-z0-9]", "").split("");

        for (int left = 0, right = str.length - 1; left < str.length; left++, right--) {
            if(!Objects.equals(str[left], str[right])){
                return false;
            }

        }
        return true;
    }

    //优解
    public static boolean isPalindrome2(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            // 跳过非字母数字字符（左指针）
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // 跳过非字母数字字符（右指针）
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // 比较字符（忽略大小写）
            if (Character.toLowerCase(s.charAt(left))
                    != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
