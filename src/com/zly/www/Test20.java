package com.zly.www;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author liyuan zheng
 * @date 2020/10/11 22:34
 */
public class Test20 {
    public static void main(String[] args) {
        Test20 test20=new Test20();
        boolean re=test20.isValid("(]");
        System.out.println(re);
    }
    public boolean isValid(String s) {
        if(s.length()==0||s.length() % 2 == 1){
            return false;
        }
        Map<String,String> map=new HashMap<String,String>();
        map.put(")","(");
        map.put("]","[");
        map.put("}","{");
        //构建栈
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char str = s.charAt(i);
            if(map.containsKey(String.valueOf(str))){
                if(stack.isEmpty() || !(String.valueOf(stack.peek()).equals(map.get(String.valueOf(str))))){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(str);
            }
        }
        return stack.isEmpty();
    }
}
