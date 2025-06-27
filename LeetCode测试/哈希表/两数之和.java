package LeetCode测试.哈希表;

import java.util.Arrays;
import java.util.HashMap;

public class 两数之和 {
    public static void main(String[] args) {


        int[] nums = {2,7,11,15};

        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] temp = new int[2];
        //暴力匹配
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    temp[0] = i;
                    temp[1] = j;
                }
            }
        }
        return temp;
    }

    public static int[] improveTwoSum(int[] nums, int target){
        //创建哈希表
        HashMap<Integer, Integer> numMap = new HashMap<>();

        //遍历
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement), i};
            }

            numMap.put(nums[i], i);
        }
        return new int[0];
    }
}
