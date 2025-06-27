package LeetCode测试.哈希表;

import java.util.HashMap;

public class 单词规律 {
    public static void main(String[] args) {



    }

    public boolean wordPattern(String pattern, String s) {

        char[] pChar = pattern.toCharArray();
        String[] sString = s.split(" ");

        if(pChar.length != sString.length){
            return false;
        }

        //创建一个hashMap
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        //要进行双向检查
        for (int i = 0; i < pChar.length; i++) {
            char ch = pChar[i];
            String word = sString[i];

            // 检查字符->单词
            if(charToWord.containsKey(ch)){
                if(!charToWord.get(ch).equals(word)){
                    return false;
                }
            }
            // 检查单词->字符
            else if (wordToChar.containsKey(word)) {
                if(!wordToChar.get(word).equals(ch)){
                    return false;
                }
            }
            // 加入映射
            else {
                charToWord.put(ch, word);
                wordToChar.put(word, ch);
            }
        }
        return true;
    }
}
