package www.niuke.com.coding;

import java.util.Arrays;

/**
 * 给定一个可能含有重复值的数组 arr，找到每一个 i 位置左边和右边离 i 位置最近且值比 arr[i] 小的位置。返回所有位置相应的信息。位置信息包括：两个数字 L 和 R，如果不存在，则值为 -1，下标从 0 开始。
 */
public class NC157 {
     /*
      @param nums int一维数组
     * @return int二维数组
     */
    public int[][] foundMonotoneStack (int[] nums) {
        // write code here
        if(nums.length == 0){
            return null;
        }
        Integer size = nums.length;
        int[][] arr = new int[size][2];
        for(int i=0;i<size;i++){
            int flag = nums[i];
            //找左边
            int left = -1;
            int leftFlag = i;
            int sub = 0;
            while (leftFlag>=0){
                if(nums[leftFlag]<flag && flag-nums[leftFlag]>sub){
                    left = leftFlag;
                    sub = flag-nums[leftFlag];
                    break;
                }
                leftFlag--;
            }
            arr[i][0] = left;
            //找右边
            int right = -1;
            int rightFlag = i;
            sub = 0;
            while (rightFlag<size){
                if(nums[rightFlag]<flag && flag-nums[rightFlag]>sub){
                    right = rightFlag;
                    sub = flag-nums[rightFlag];
                    break;
                }
                rightFlag++;
            }
            arr[i][1] = right;
            //数组复制
        }
        return arr;
    }


    public static void main(String[] args) {
        NC157 nc157 = new NC157();
        int[] arr = new int[]{3,4,1,5,6,2,7};
        int[][] num = nc157.foundMonotoneStack(arr);
        for(int i=0;i<num.length;i++){
            System.out.println(Arrays.toString(num[i]));
        }
    }
}
