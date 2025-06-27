package LeetCode测试.哈希表;

public class 同构字符串 {

    public static void main(String[] args) {


        System.out.println(isIsomorphic("egg", "add"));
    }

    public static boolean isIsomorphic(String s, String t) {

        int n = s.length();
        int[] mapS = new int[256];
        boolean[] append = new boolean[256];

        //初始化数组

        for (int i = 0; i < 256; i++) {
            mapS[i] = -1;
        }

        //开始判断
        for (int i = 0; i < n; i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            //判断是否有映射
            if(mapS[sChar] != -1){
                // 检查映射是否匹配
                if(mapS[sChar] != tChar){
                    return false;
                }
            } else {
                //若tChar已经被其他字符映射
                if(append[tChar]){
                    return false;
                }
                mapS[sChar] = tChar;
                append[tChar] = true;
            }
        }
        return true;
    }
}
