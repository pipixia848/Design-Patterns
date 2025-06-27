package LeetCode测试.数组字符串;

import java.util.Arrays;

public class 轮转数组 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};


        rotate(nums, 3);

    }

    public static void rotate(int[] nums, int k) {

        //简单方法
        //先取出尾部的元素，然后加在数组的头部

        if(nums.length == 1 || nums.length == 0){
            return;
        }
        k = k%nums.length;
        int[] tnums = new int[k];
        int[] tnums2 = new int[nums.length-k];

        for (int i = nums.length-k,j = 0; i < nums.length ; i++,j++) {
            tnums[j] = nums[i];
        }
        for (int i = 0; i < nums.length-k; i++) {
            tnums2[i] = nums[i];
        }


        System.arraycopy(tnums, 0, nums,0, tnums.length);
        System.arraycopy(tnums2, 0, nums, tnums.length, tnums2.length);

        System.out.println(Arrays.toString(nums));
    }
}
