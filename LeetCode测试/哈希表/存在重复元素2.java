package LeetCode测试.哈希表;

import java.util.HashMap;

public class 存在重复元素2 {

    public static void main(String[] args) {

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        //使用HashMap
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {


            if(numMap.containsKey(nums[i])
                    && Math.abs(numMap.get(nums[i]) - i) <= k){
                return true;

            }

            numMap.put(nums[i], i);


        }

        return false;
    }
}
