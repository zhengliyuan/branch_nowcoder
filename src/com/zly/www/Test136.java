package com.zly.www;

/**
 * @author liyuan zheng
 * @date 2020/10/12 20:09
 */
public class Test136 {
    public static void main(String[] args) {
        Test136 test136=new Test136();
        test136.singleNumber(new int[]{4,1,2,1,2});
    }
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            int flag=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j] && i != j){
                    flag=1;
                    continue;
                }
            }
            if(flag==0){
                result=nums[i];
                break;
            }
        }
        System.out.println(result);
        return result;
    }
}
