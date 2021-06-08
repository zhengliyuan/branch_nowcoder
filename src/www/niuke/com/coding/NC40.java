package www.niuke.com.coding;

import www.niuke.com.base.ListNode33;
import java.util.*;

public class NC40 {
    public ListNode33 addInList (ListNode33 head1, ListNode33 head2) {
        // write code here
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        int flag = 0;
        while (head1 != null){
            stack1.push(head1.val);
            head1 = head1.next;
        }
        while (head2 != null){
            stack2.push(head2.val);
            head2 = head2.next;
        }
        //计算每一位置的值
        while (stack1.size()>0 && stack2.size()>0){
            int temp = stack1.pop() + stack2.pop();
            stack3.push((temp+flag)%10);
            flag = (temp+flag)/10;
        }
        if(stack1.size()>0){
            int value1= stack1.pop()+flag;
            stack3.push(value1%10);
            flag = value1/10;
        }
        if(stack2.size()>0){
            int value2= stack2.pop()+flag;
            stack3.push(value2%10);
            flag = value2/10;
        }
        //构建链表
        ListNode33 head= new ListNode33();
        ListNode33 temp = head;
        if(flag == 1){
            ListNode33 listNode33 = new ListNode33();
            listNode33.val = flag;
            temp.next = listNode33;
            temp = temp.next;
        }
        while (stack3.size()>0){
            ListNode33 tempList = new ListNode33();
            tempList.val = stack3.pop();
            temp.next = tempList;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode33 list1 = new ListNode33();
        ListNode33 list11 = new ListNode33();
        list11.val = 9;
        ListNode33 list12 = new ListNode33();
        list12.val = 3;
        ListNode33 list13 = new ListNode33();
        list13.val= 7;
        list12.next = list13;
        list11.next = list12;
        list1.next = list11;

        ListNode33 list2 = new ListNode33();
        ListNode33 list21 = new ListNode33();
        list21.val = 6;
        ListNode33 list22 = new ListNode33();
        list22.val = 3;
        list21.next = list22;
        list2.next = list21;

        NC40 nc40 = new NC40();
        nc40.addInList(list1,list2);
    }
}
