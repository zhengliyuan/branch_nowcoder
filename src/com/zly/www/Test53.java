package com.zly.www;

/**
 * @author liyuan zheng
 * @date 2020/10/12 19:12
 */
public class Test53 {
    public static void main(String[] args) {
        Test53 test53=new Test53();
        test53.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }

    public int maxSubArray(int[] nums) {
        int count=0;
        if(nums.length==0){
            return count;
        }
        count=nums[0];
        int pre=0;
        for(int x:nums){
            pre=Math.max(pre+x,x);
            count=Math.max(count,pre);
        }
        return count;
    }
}
