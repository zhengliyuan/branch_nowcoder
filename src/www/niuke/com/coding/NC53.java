package www.niuke.com.coding;

import java.util.Stack;

/**
 * @author liyuan zheng
 * @date 2020/12/1 23:25
 * 括号序列
 */
public class NC53 {
    public static void main(String[] args) {
        NC53 nc53 = new NC53();
        String str = "()";
        System.out.println(nc53.isValidTest(str));
    }
    public boolean isValidTest(String s) {
        char[] chars = s.toCharArray();
        boolean result = false;
        if(chars.length==1){
            return result;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<chars.length;i++){
            char tempStr = chars[i];
            if(tempStr == '{'){
                stack.push('}');
            }else if(tempStr == '['){
                stack.push(']');
            }else if(tempStr == '('){
                stack.push(')');
            }else if(stack.isEmpty() || stack.pop() != tempStr){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
