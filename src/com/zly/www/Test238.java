package com.zly.www;

import java.util.Arrays;

/**
 * @author liyuan zheng
 * @date 2020/10/10 22:05
 */
public class Test238 {
    public static void main(String[] args) {
        Test238 test238 = new Test238();
        test238.productExceptSelf1(new int[]{1,2,3,4});
        test238.productExceptSelf2(new int[]{1,2,3,4});
    }
    public int[] productExceptSelf1(int[] nums) {
        int numsLen = nums.length;
        if(numsLen == 0){
            return nums;
        }
        //声明三个数组,分别存放前缀之积、后缀之积、结果
        int[] L = new int[numsLen];
        L[0] = 1;
        int[] R = new int[numsLen];
        R[numsLen-1] = 1;
        int[] answer = new int[numsLen];
        for(int i=1;i<numsLen;i++){
            L[i] = nums[i-1] * L[i-1];
        }
        for(int i=numsLen-2;i>=0;i--){
            R[i] = nums[i+1] * R[i+1];
        }

        for(int i=0;i<numsLen;i++){
            answer[i] = L[i] * R[i];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public int[] productExceptSelf2(int[] nums) {
        int numsLen = nums.length;
        if(numsLen == 0){
            return nums;
        }
        //声明三个数组,分别存放前缀之积、后缀之积、结果
        int[] answer = new int[numsLen];
        answer[0] = 1;

        for(int i=1;i<numsLen;i++){
            answer[i] = nums[i-1] * answer[i-1];
        }
        int R = 1;
        for(int i=numsLen-1;i>=0;i--){
            answer[i] = answer[i] * R;
            R *= nums[i];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }


}
