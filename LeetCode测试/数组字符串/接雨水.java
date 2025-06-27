package LeetCode测试.数组字符串;

public class 接雨水 {
    public static void main(String[] args) {

        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trap(nums));
    }

    public static int trap(int[] height) {

        if(height.length == 0){
            return 0;
        }


        //从左往右遍历，找出右侧的最大值
        int n = height.length;
        int[] rightMax = new int[n];
        rightMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            rightMax[i] = Math.max(rightMax[i-1], height[i]);
        }

        //从右向左遍历，找出左侧最大值
        int[] leftMax = new int[n];
        leftMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--){
            leftMax[i] = Math.max(leftMax[i + 1], height[i]);
        }

        int totalWater = 0;
        for (int i = 0; i < height.length; i++) {
            int levelWater = Math.min(leftMax[i], rightMax[i]);
            totalWater += levelWater - height[i];
        }

        return totalWater;

    }
}
