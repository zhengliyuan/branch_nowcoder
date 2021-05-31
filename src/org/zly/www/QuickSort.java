package org.zly.www;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    public void quickSort(int[] arr,int begin,int end){
        if(begin < end){
            //取基准
            int flag = arr[begin];
            int i = begin;
            int j = end;
            while (i<j){
                while (i<j && arr[j]>flag){
                    j--;
                }
                arr[i] = arr[j];
                while (i<j && arr[i]<=flag){
                    i++;
                }
                arr[j] = arr[i];
            }
            arr[i] = flag;
            quickSort(arr,begin,i-1);
            quickSort(arr,i+1,end);
        }else{
            return;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{23,45,17,11,13,89,72,26,3,17,11,13};
        int num = 12;
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr,0,num-1);
        System.out.println(Arrays.toString(arr));
    }
}
