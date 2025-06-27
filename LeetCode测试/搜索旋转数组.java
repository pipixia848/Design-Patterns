package LeetCode测试;

public class 搜索旋转数组 {
    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target){
        if(nums == null || nums.length == 0) return -1;
        int temp = 0;

        //寻找旋转点
        for (int i = 0,j = 1; i < nums.length && j < nums.length; i++,j++) {
            if(nums[i] > nums[j]){
                temp = i;
                break;
            }
        }

        //处理数组长度为1
        if(nums.length == 1){
            return nums[0] == target ? 0 : -1;
        }

        //检查数组是否被旋转
        if (nums[0] <= nums[nums.length - 1]) {
            // 整个数组有序，直接二分查找
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) return mid;
                else if (nums[mid] < target) left = mid + 1;
                else right = mid - 1;
            }
            return -1;
        }

        //将数组分成两部分
        //1.后半部分
        if(target <= nums[nums.length-1]){
            int left = temp + 1;
            int right = nums.length - 1;

            while(left <= right){
                int mid = (left+right)/2;
                if(nums[mid] == target){
                    return mid;
                } else if (nums[mid] > target) {
                    right = mid -1;
                } else {
                    left = mid + 1;
                }
            }
        } else  {
            int left = 0;
            int right = temp ;

            while(left <= right){
                int mid = (left+right)/2;
                if(nums[mid] == target){
                    return mid;
                } else if (nums[mid] > target) {
                    right = mid -1;
                } else {
                    left = mid + 1;
                }
            }

        }
        return -1;

    }
}
