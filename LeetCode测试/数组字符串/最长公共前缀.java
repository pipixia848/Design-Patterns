package LeetCode测试.数组字符串;

public class 最长公共前缀 {
    public static void main(String[] args) {


        String[] s = {"ca","c","bba","bacb","bcb"};

        System.out.println(longestCommonPrefix(s));

    }

    public static String longestCommonPrefix(String[] strs) {

        String communal = "";
        if(strs.length == 0 || strs == null){
            return communal;
        }
        if(strs.length == 1){
            return strs[0];
        }
        if(strs.length == 2){
            return findCommunal(strs[0], strs[1]);
        }

        for (int i = 2; i < strs.length; i++) {
            if(findCommunal(strs[i-1], strs[i-2]) == ""){
                break;
            } else {
                communal = findCommunal(findCommunal(strs[i-1], strs[i-2]), strs[i]);
            }
        }



        return communal;
    }

    public static String findCommunal(String str1, String str2){
        StringBuilder temp = new StringBuilder();
        int index = Math.min(str1.length(), str2.length());

        if(str1.isEmpty() || str2.isEmpty()){
            return "";
        }

        for (int i = 0; i < index; i++) {
            if(str1.charAt(i) == str2.charAt(i)){
                temp.append(str1.charAt(i));
            } else {
                break;
            }
        }

        return temp.toString();

    }

    //使用垂直扫描
    public String LongestCommonPrefix(String[] strs){
        if(strs.length == 0 || strs == null){
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {

            char c = strs[0].charAt(i);

            for (int j = 0; j < strs.length; j++) {
                //停止扫描，当前字符串长度不足，不匹配
                if(i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
