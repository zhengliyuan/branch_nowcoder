package cn.niuke.www;

import java.util.Arrays;

/**
 * @author liyuan zheng
 * @date 2020/11/8 21:19
 */
public class Sort {
    public static void quiclSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i = low;
        j = high;
        temp = arr[low];
        while (i<j){
            while (temp<=arr[j]&&i<j){
                j--;
            }
            while (temp>=arr[i]&&i>j){
                i++;
            }
            if(i<j){
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quiclSort(arr,low,j-1);
        quiclSort(arr,j+1,high);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{10,7,2,4,7,62,3,4,2,1,8,9,19};
        quiclSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
