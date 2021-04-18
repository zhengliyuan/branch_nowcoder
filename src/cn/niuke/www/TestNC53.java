package cn.niuke.www;

import java.util.Stack;

/**
 * @author liyuan zheng
 * @date 2020/10/14 21:06
 */
public class TestNC53 {
    public static void main(String[] args) {
        TestNC53 testNC53 = new TestNC53();
        ListNode listNode11 = new ListNode(9);
        ListNode listNode12 = new ListNode(3);
        ListNode listNode13 = new ListNode(7);
        listNode11.next = listNode12;
        listNode12.next = listNode13;
        ListNode listNode21 = new ListNode(6);
        ListNode listNode22 = new ListNode(3);
        listNode21.next = listNode22;
        testNC53.addInList(listNode11,listNode21);
    }

    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        ListNode low = head;
        ListNode fast = head;
        ListNode res = head;
        int flag=1;
        while(flag < n){
            fast = fast.next;
            flag++;
        }
        if(fast.next == null){
            return head.next;
        }
        while(fast.next != null){
            res = low;
            fast = fast.next;
            low = low.next;
        }
        res.next = low.next;
        return head;
    }

    public ListNode addInList (ListNode head1, ListNode head2) {
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        // write code here
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();
        while(head1 != null){
            stack1.push(head1.val);
            head1 = head1.next;
        }
        while(head2 != null){
            stack2.push(head2.val);
            head2 = head2.next;
        }
        int temp = 0;
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            int num1 = stack1.pop();
            int num2 = stack2.pop();
            int sum = num1 + num2 + temp;
            if(sum>=10){
                temp = 1;
                sumStack.push(sum % 10);
            }else{
                temp= 0;
                sumStack.push(sum);
            }
        }
        while(!stack1.isEmpty()){
            int sum = stack1.pop() + temp;
            if(sum>=10){
                temp = 1;
                sumStack.push(sum % 10);
            }else{
                temp= 0;
                sumStack.push(sum);
            }
        }
        while(!stack2.isEmpty()){
            int sum = stack2.pop() + temp;
            if(sum>=10){
                temp = 1;
                sumStack.push(sum % 10);
            }else{
                temp= 0;
                sumStack.push(sum);
            }
        }
        if(temp == 1){
            sumStack.push(1);
        }
        ListNode head = new ListNode(0);
        ListNode res = head;
        while(!sumStack.isEmpty()){
            ListNode nodeTemp = new ListNode(sumStack.pop());
            res.next = nodeTemp;
            res = res.next;
        }
        return head.next;

    }


}
