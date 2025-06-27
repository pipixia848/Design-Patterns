package LeetCode测试.数组字符串;

public class 买股票 {
    public static void main(String[] args) {


        int[] num = {7,1,5,3,6,4};

        maxProfit(num);
    }

    public static int maxProfit(int[] prices) {

        //可先找出数组中最小的数的索引，若index == prices.length-1
        //则直接return 0;

        //暴力算法：先用第一轮遍历找出最小值的索引，
        //然后在以最小数索引为起点找数组剩余数中的最大数
        //相减返回即可


        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0; //最大利润

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
