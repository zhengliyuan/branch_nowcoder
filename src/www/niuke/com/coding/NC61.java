package www.niuke.com.coding;

import java.util.Arrays;

/**
 * 给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
 * 你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），需要满足 index1 小于index2.。注意：下标是从1开始的
 * 假设给出的数组中只存在唯一解
 * 例如：
 * 给出的数组为 {20, 70, 110, 150},目标值为90
 * 输出 index1=1, index2=2
 */
public class NC61 {
    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        int[] res = new int[]{0,0};
        if(numbers.length == 0 || numbers.length == 1){
            return null;
        }
        for(int i=0;i<numbers.length-1;i++){
            int tempI = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                int tempJ = numbers[j];
                if(tempI + tempJ == target){
                    res[0] = i+1;
                    res[1] = j+1;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{3,2,4};
        NC61 nc61 = new NC61();
        System.out.println(Arrays.toString(nc61.twoSum(numbers,6)));
    }
}
