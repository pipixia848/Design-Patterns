package LeetCode测试.哈希表;

public class 赎金信 {
    public static void main(String[] args) {

        String s = "hello";
        String s2 = new String("hello");

        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
    }

    public boolean canConstruct(String ransomNote, String magazine) {


        if(ransomNote.length() > magazine.length()){
            return false;
        }

        int[] charCount = new int[26];


        //两个循环是精髓
        for (char c : magazine.toCharArray()){
            charCount[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()){
            if(--charCount[c - 'a'] < 0){
                return false;
            }
        }

        return true;
    }
}
