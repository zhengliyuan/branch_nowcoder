package com.zly.www;

import java.util.Arrays;

/**
 * @author liyuan zheng
 * @date 2020/10/12 19:27
 */
public class Test88 {
    public static void main(String[] args) {

    }
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums1,0,nums2,m,n);
        Arrays.sort(nums1);
    }
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums1,0,nums2,m,n);
        Arrays.sort(nums1);
    }
}
