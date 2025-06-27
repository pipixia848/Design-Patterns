package LeetCode测试.哈希表;

import java.util.HashSet;
import java.util.Set;

public class 最长连续序列 {

    public static void main(String[] args) {

    }


    // maxLength, currentNum, currentLength
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0 || nums == null){
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();

        int maxLength = 0;

        for (int num : nums){
            numSet.add(num);
        }

        for (int num : numSet) {

            if(!numSet.contains(num - 1)){
                int currentNum = num;
                int currentLength = 1;

                while (numSet.contains(currentNum + 1)){
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }

        }

        return maxLength;

    }

}
