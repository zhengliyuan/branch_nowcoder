package www.niuke.com.coding;

import org.zly.www.QuickSort;

import java.util.Arrays;

/**
 * 有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
 *
 * 给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
 */
public class NC88 {
    public int findKth(int[] a, int n, int K) {
        // write code here
        NC88 nc88 = new NC88();
        int num = nc88.quik(a,0,n-1,K);
        return num;
    }

    public int quik(int[] arr,int l,int r,int k){
        int temp = quickSort(arr,l,r,k);
        if(temp == (arr.length-k)){
            return arr[temp];
        }else if(temp > (arr.length-k)){
            return quik(arr,l,temp-1,k);
        }else{
            return quik(arr,temp+1,r,k);
        }
    }

    public int quickSort(int[] arr,int begin,int end,int K){
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
        return i;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{23,45,17,11,13,89,72,26,3,17,11,13};
        int num = 12;
       NC88 nc88 = new NC88();
       int count =nc88.findKth(arr,num,2);
        System.out.println(count);
    }
}
