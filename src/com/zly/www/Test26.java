package com.zly.www;

/**
 * @author liyuan zheng
 * @date 2020/10/11 22:11
 */
public class Test26 {
    public static void main(String[] args) {
        Test26 test26=new Test26();
        test26.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }
        }
        System.out.println(i+1);
        return i+1;
    }
}
