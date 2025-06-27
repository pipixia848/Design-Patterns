package LeetCode测试.数组字符串;

public class 除自身以外的数组的乘积 {
    public static void main(String[] args) {

        int[] nums = {-1,1,0,-3,3};

        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums) {


        /*
        原数组：       [1       2       3       4]
        左部分的乘积：   1       1      1*2    1*2*3
        右部分的乘积： 2*3*4    3*4      4      1
        结果：        1*2*3*4  1*3*4   1*2*4  1*2*3*1
         */
        //可先定义两个数组，

        if(nums == null || nums.length == 0){
            return new int[0];
        }


        int[] target = new int[nums.length];

        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i >= 1) {
                left = left * nums[i - 1];
            }
            target[i] = left;
        }

        int right = 1;
        for (int i = nums.length - 1;  i >= 0 ; i--) {
            if(i < nums.length - 1){
                right = right * nums[i + 1];
            }
            target[i] *= right;
        }


        return target;


    }
}
