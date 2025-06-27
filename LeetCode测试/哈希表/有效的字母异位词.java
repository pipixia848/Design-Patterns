package LeetCode测试.哈希表;

public class 有效的字母异位词 {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {

        int[] temp = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        for (char tempChar : s.toCharArray()){
            temp[tempChar - 'a']++;
        }

        for (char tempChar : t.toCharArray()) {
            if(--temp[tempChar - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
