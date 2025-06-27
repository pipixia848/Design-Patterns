package LeetCode测试.数组字符串;

public class 移除元素 {
    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));

    }

    public static int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
