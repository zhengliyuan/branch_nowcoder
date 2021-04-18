package com.zly.www;

import java.util.HashMap;

/**
 * @author liyuan zheng
 * @date 2020/10/10 23:18
 */
public class Test217 {
    public static void main(String[] args) {
        Test217 test217=new Test217();
        boolean result= test217.containsDuplicate(new int[]{1,2,3,4});
        System.out.println(result);
    }
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0||nums.length==1){
            return false;
        }
        HashMap map = new HashMap();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],nums[i]);
        }
        return false;

    }
}
