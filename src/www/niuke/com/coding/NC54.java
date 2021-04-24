package www.niuke.com.coding;

import java.util.ArrayList;

/**
 * 给出一个有n个元素的数组S，S中是否有元素a,b,c满足a+b+c=0？找出数组S中所有满足条件的三元组。
 * 注意：
 * 三元组（a、b、c）中的元素必须按非降序排列。（即a≤b≤c）
 * 解集中不能包含重复的三元组。
 */
public class NC54 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(num.length == 0){
            return res;
        }
        //存在的正常情况
        for(int i =0;i<num.length;i++){
            ArrayList<Integer> resTemp = new ArrayList<>();
            int oneTemp = num[i];
            for(int j=0;j<num.length;j++){
                int twoTemp = num[j];
                for(int k=0;k<num.length;k++){
                    int threeTemp = num[k];
                    if(oneTemp + twoTemp + threeTemp == 0){
                        resTemp.add(oneTemp);
                        resTemp.add(twoTemp);
                        resTemp.add(threeTemp);
                    }
                }
            }
            if(resTemp != null){
                res.add(resTemp);
            }
        }
        return res;
    }
}
