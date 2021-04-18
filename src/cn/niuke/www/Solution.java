package cn.niuke.www;

/**
 * @author liyuan zheng
 * @date 2020/10/13 21:50
 */
import java.util.Queue;
import java.util.Stack;
public class Solution {
    //stack1为主
    Stack<Integer> stack1 = new Stack<>();
    //辅助最小函数
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        if(stack1.isEmpty()){
            stack1.push(node);
            stack2.push(node);
        }else{
            stack1.push(node);
            if(node<stack2.peek()){
                stack2.push(node);
            }else{
                stack2.push(stack1.peek());
            }
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.push(3);
    }
}
