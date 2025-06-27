package LeetCode测试;

import java.util.ArrayList;
import java.util.List;

public class 楼梯 {
    public static void main(String[] args) {

        int[] s = {1,2,3,1};

        System.out.println(rob(s));
    }

    public static int climbStairs(int n){

        int p = 0, q = 0, r = 1;

        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;



    }

    public static int rob(int[] nums){

        int n = nums.length;
        int second = nums[0], first = 0, res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            res = Math.max(first + nums[i], second);

            first = second;
            second = res;

        }
        return res;

    }
}
