package LeetCode测试.哈希表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 字母异位词分组 {
    public static void main(String[] args) {

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        // 首先遍历这个字符串数组，然后将这个数组排序

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);

            String key = new String(charArray);
            //核心
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
