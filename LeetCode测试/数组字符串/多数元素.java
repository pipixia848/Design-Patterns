package LeetCode测试.数组字符串;

import java.util.Arrays;

public class 多数元素 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length/2];

    }

    public int majorityElement2(int[] nums){
        int winner = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if(winner == nums[i]){
                count++;
            } else if (count == 0) {
                winner = nums[i];
            } else {
                count--;
            }
        }
        return winner;
    }
}
