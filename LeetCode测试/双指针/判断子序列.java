package LeetCode测试.双指针;

public class 判断子序列 {
    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;
        for (; i < s.length() && j < t.length();) {
            if(s.charAt(i) != t.charAt(j)){
                j++;
            } else {
                i++;
                j++;
            }
        }
        return i == s.length();
    }
}
