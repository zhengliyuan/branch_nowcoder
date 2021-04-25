package www.niuke.com.coding;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 给出一个有n个元素的数组S，S中是否有元素a,b,c满足a+b+c=0？找出数组S中所有满足条件的三元组。
 * 注意：
 * 三元组（a、b、c）中的元素必须按非降序排列。（即a≤b≤c）
 * 解集中不能包含重复的三元组。
 */
public class NC54 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(num.length == 0 || num.length<3){
            return res;
        }
        //存在的正常情况
        for(int i =0;i<num.length-2;i++){
            //过滤掉重复的
            if(i != 0 && num[i] == num[i-1]){
                continue;
            }
            int left = i+1;
            int right = num.length-1;
            int target = -num[i];
            while (left < right){
                int midValue = num[left] + num[right];
                if(midValue == target){
                    res.add(new ArrayList<>(Arrays.asList(num[i],num[left],num[right])));
                    while (left<right&&num[left] == num[left+1]){
                        left++;
                    }
                    while (left<right && num[right] == num[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(midValue < target){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {0,0,0};
        NC54 nc = new NC54();
        nc.threeSum(num);
    }
}
