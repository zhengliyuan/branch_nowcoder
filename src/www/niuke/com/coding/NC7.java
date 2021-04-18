package www.niuke.com.coding;


/**
 * 假设你有一个数组，其中第\ i i 个元素是股票在第\ i i 天的价格。
 * 你有一次买入和卖出的机会。（只有买入了股票以后才能卖出）。请你设计一个算法来计算可以获得的最大收益。
 * @Date 2021年3月7日17:13:57
 */
public class NC7 {
    public int maxProfit (int[] prices) {
        // write code here
        //每天买入后，后面哪天卖出挣的钱最多
        int count = 0;
        if(prices.length==0){
            return 0;
        }
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                count = Math.max(count,prices[j]-prices[i]);
            }
        }
        return count;
    }
}
