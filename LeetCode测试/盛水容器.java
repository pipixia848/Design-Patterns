package LeetCode测试;

public class 盛水容器 {
    public static void main(String[] args) {

        int[] height = {8,7,2,1};
        System.out.println(maxArea(height));

    }
    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length-1; i < j; ){


            //从前向后遍历
            if(max < Math.min(height[i],height[j]) * (j-i)){
                max = Math.min(height[i],height[j]) * (j-i);

            }
            if(height[i] < height[j]){
                i++;
            } else {
                j--;
            }

        }
        return max;
//        int max = 0;
//        int i = 0, j = height.length - 1;
//        while (i < j) {
//            int current = Math.min(height[i], height[j]) * (j - i);
//            max = Math.max(max, current);
//            if (height[i] < height[j]) {
//                i++;
//            } else {
//                j--;
//            }
//        }
//        return max;

    }
}
