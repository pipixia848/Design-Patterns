package LeetCode测试.数组字符串;

public class 删除有序数组重复项 {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if(n == 0){
            return 0;
        }

        int fast = 1;
        int slow = 1;

        while(fast < n){
            if(nums[fast] != nums[fast - 1]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;

        }
        return slow;
    }

    public int removeDuplicates2(int[] nums) {
        int n = nums.length;

        if(n == 0){
            return 0;
        }

        int fast = 2;
        int slow = 2;

        while(fast < n){
            if(nums[fast] != nums[slow - 2] ){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;

        }
        return slow;
    }
}
