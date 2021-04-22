package www.niuke.com.coding;

import java.util.Stack;

/**
 * 给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
 * 括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
 */
public class NC52 {
    public boolean isValid (String s) {
        char[] chars = s.toCharArray();
        boolean result = false;
        if(chars.length==1 || chars.length % 2 == 1){
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


    public static void main(String[] args) {
        String s= "()[]{}";
        NC52 nc52 = new NC52();
        System.out.println(nc52.isValid(s));
    }
}

