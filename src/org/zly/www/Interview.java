package org.zly.www;

/**
 * @author liyuan zheng
 * @date 2020/10/27 20:08
 */
public class Interview {
    public static void main(String[] args) {
        int[] number = new int[]{72,6,57,88,60,42,83,73,48,85};
        int flag = number[0];

    }
    public void getSort(int[] arr,int begin,int end){
        if(arr.length == 0){
            return;
        }
        int flag = arr[begin];
        while(end<=begin){
            if(arr[end] < flag){
                int temp = arr[end];
                arr[end] = arr[begin];
                arr[begin] = temp;
            }
        }
    }

}
