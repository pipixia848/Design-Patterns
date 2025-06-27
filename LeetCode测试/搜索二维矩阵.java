package LeetCode测试;

public class 搜索二维矩阵 {
    public static void main(String[] args) {

        int[][] i= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(i, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target){

        //首先搜索二维矩阵的每一行的最前一个和末尾的值
        //确定在第几行
        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            if(target >= matrix[i][0] && target <= matrix[i][matrix[0].length-1]){
                temp = i;
            }
        }

        //二分查找
//        int left = 0;
//        int right = matrix[0].length-1;
//
//        while(left < right){
//            int mid = (left + right)/2;
//
//            if(target == matrix[temp][mid]){
//                return true;
//            } else if (target <= matrix[temp][mid]) {
//                mid = right -1;
//            } else {
//                mid = left + 1;
//            }
//        }
//        return false;

        for (int i = 0; i < matrix[temp].length; i++) {
            if(target == matrix[temp][i]){
                return true;
            }
        }
        return false;
    }
}
