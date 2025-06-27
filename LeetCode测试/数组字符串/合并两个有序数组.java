package LeetCode测试.数组字符串;

public class 合并两个有序数组 {
    public static void main(String[] args) {

        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};

        merge(num1, 3, num2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = 0, p2 = 0;
        int cur = 0;
        int[] temp = new int[m + n];


        while (p1 < m && p2 < n) {
            //进行两次次判断
            if (nums1[p1] <= nums2[p2]) {
                temp[cur++] = nums1[p1++];
            } else {
                temp[cur++] = nums2[p2++];

            }
        }

            //处理剩余元素
            while (p1 < m) {
                temp[cur++] = nums1[p1++];
            }

            while (p2 < n) {
                temp[cur++] = nums2[p2++];
            }


            for (int i = 0; i < temp.length; i++) {
                nums1[i] = temp[i];
            }


        }

}
