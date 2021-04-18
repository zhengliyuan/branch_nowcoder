package cn.niuke.www;

import java.util.Stack;

/**
 * @author liyuan zheng
 * @date 2020/10/15 12:10
 */
public class TestOther {
    public static void main(String[] args) {
        TestOther testOther = new TestOther();
        testOther.isValid("()");
    }

    public boolean isValid (String s) {
        // write code here
        Stack<String> stack = new Stack<>();
        if(s.length()==0||s.length()==1){
            return false;
        }
        for(int start=0;start<s.length();start++){
            String temp = s.substring(start,start+1);
            switch(temp){
                case "{":
                    stack.push(temp);
                    break;
                case "[":
                    stack.push(temp);
                    break;
                case "(":
                    stack.push(temp);
                    break;
                case "}":
                    if(stack.pop() != "{"){
                        return false;
                    }
                    break;
                case "]":
                    if(stack.pop() != "["){
                        return false;
                    }
                    break;
                case ")":
                    if(stack.pop() .equals("(")){
                        return false;
                    }
                    stack.pop();
                    break;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;

    }
}
