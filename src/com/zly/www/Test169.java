package com.zly.www;

import java.util.Collection;
import java.util.Collections;

/**
 * @author liyuan zheng
 * @date 2020/10/12 20:59
 */
public class Test169 {
    public static void main(String[] args) {
        Test169 test169=new Test169();
        test169.majorityElement(new int[]{6,5,5});
    }
    public int majorityElement(int[] nums) {
        int count=nums[0];
        for(int i=0;i<nums.length;i++){
            int flag=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] == nums[i]){
                    flag++;
                }
            }
            if(flag>nums.length/2){
                count = nums[i];
                break;
            }
        }
        System.out.println(count);
        return count;
    }
}
