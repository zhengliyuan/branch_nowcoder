package www.niuke.com.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * 实现一个特殊功能的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。
 */
public class NC90 {
    public Stack<Integer> stack = new Stack<>();
    public int min = Integer.MAX_VALUE;

    public void push(int number){
        stack.push(number);
        if(number<min){
            min = number;
        }
    }
    public void pop(){
        stack.pop();
    }

    public  int getMinNumber(){
        int temp = min;
        min = Integer.MAX_VALUE;
        return temp;
    }
    public int[] getMinStack (int[][] op) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i= 0;i<op.length;i++){
            int temp = op[i][0];
            if( temp== 1){
                //添加
                push(op[i][1]);
            }else if(temp == 2){
                //pop
                pop();
            }else{
                //获取最小值
                list.add(getMinNumber());
            }
        }
        int[] res = new int[list.size()];
        int i = 0;
        for(int num:list){
            res[i++] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] test = new int[][]{{1,3},{1,2},{1,1},{3},{2},{3}};
        NC90 nc90 = new NC90();
        System.out.println(Arrays.toString(nc90.getMinStack(test)));

    }
}
