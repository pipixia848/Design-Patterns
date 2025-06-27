package LeetCode测试.数组字符串;

public class 找字符串匹配下标 {
    public static void main(String[] args) {


        System.out.println(strStr("mississippi", "issip"));
    }

    public static int strStr(String haystack, String needle) {


        for (int i = 0, index = 0; i < haystack.length(); ) {

            if(haystack.charAt(i) == needle.charAt(index)){

                if(index == needle.length()-1){
                    return i - index;
                }
                index++;
                i++;

            } else  {
                i=i-index+1;
                index = 0;

            }

        }
        return -1;

    }
}
