package LeetCode测试.数组字符串;

public class 跳跃游戏 {
    public static void main(String[] args) {

    }

    public boolean canJump(int[] nums) {

        int step = 1;

        for (int i = nums.length-2; i >= 0 ; i--) {

            if(nums[i] < step){
                step++;
            } else {
                step = 1;
            }
        }

        return step == 1;
    }
}
