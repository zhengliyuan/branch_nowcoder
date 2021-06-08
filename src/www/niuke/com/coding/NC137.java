package www.niuke.com.coding;

import java.util.Stack;

/**
 * 请写一个整数计算器，支持加减乘三种运算和括号。
 */
public class NC137 {
    public int solve (String s) {
        // write code here
        Stack<String> stack = new Stack<>();
        if(s == null || s.length() ==0){
            return 0;
        }
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++){
            
        }
        return Integer.parseInt(stack.pop());
    }
}
