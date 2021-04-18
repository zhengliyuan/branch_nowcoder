package com.zly.www;

/**
 * @author liyuan zheng
 * @date 2020/10/12 19:54
 */
public class Test121 {
    public static void main(String[] args) {
        Test121 test121=new Test121();
        test121.maxProfit(new int[]{7,1,5,3,6,4});
    }
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                count = Math.max(count,prices[j]-prices[i]);
            }
        }
        System.out.println(count);
        return count;
    }
}
