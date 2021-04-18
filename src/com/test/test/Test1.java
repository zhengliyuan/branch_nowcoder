package com.test.test;

import com.didi.www.Question;
import com.zly.www.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liyuan zheng
 * @date 2020/10/27 19:12
 */
public class Test1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.deleteNum();
    }
    public void deleteNum(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for(int i=0;i<list.size();i++){
            if(list.get(i) % 2 == 0){
                list.remove(list.get(i));
            }

        }
    }

    //快速排序
    public void quickSOrt(int[] arr,int low,int high){
        int i,j,flagNum;
        if(low>high){
            return;
        }
        i = low;
        j = high;
        flagNum = arr[low];
        while(i<j){
            while(arr[j]<=flagNum && i<j){
                j--;
            }
            while(arr[i]>=flagNum && i<j){
                i++;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[i];
        arr[i] = flagNum;
        quickSOrt(arr,low,i-1);
        quickSOrt(arr,i+1,high);
    }
}
