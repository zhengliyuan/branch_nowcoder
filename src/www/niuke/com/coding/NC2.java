package www.niuke.com.coding;

import www.niuke.com.base.ListNode;
import www.niuke.com.base.ListNode2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liyuan zheng
 * @date 2020/12/5 19:39
 * 要求使用原地算法，不能改变节点内部的值，需要对实际的节点进行交换。
 * 例如：
 * 对于给定的单链表{10,20,30,40}，将其重新排序为{10,40,20,30}.
 */
public class NC2 {
    public static void main(String[] args) {
        NC2 nc2= new NC2();
        ListNode2 head = null;
        ListNode2 l1 = new ListNode2(10);
        head = l1;
        ListNode2 l2 = new ListNode2(20);
        l1.next=l2;
        ListNode2 l3 = new ListNode2(30);
        l2.next = l3;
        ListNode2 l4 = new ListNode2(40);
        l3.next = l4;
        nc2.reorderList2(head);

    }

    /**
     * 借助数组，取出来完之后再构建
     * @param head
     */
    public void reorderList(ListNode2 head) {
        if(head == null){
            return;
        }
        List<ListNode2> list = new ArrayList<>();
        while (head != null){
            list.add(head);
            head = head.next;
        }
        int i=0,j=list.size()-1;
        while (i<j){
            list.get(i).next = list.get(j);
            i++;
            if(i ==j){
                break;
            }
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }

    /**
     * 找中间阶段
     * 反转后半部分
     * 前后交叉
     * @param head
     */
    public void reorderList2(ListNode2 head) {
        if(head == null || head.next == null || head.next.next == null){
            return;
        }
        ListNode2 slow = head;
        ListNode2 fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode2 mid = slow.next;
        slow.next = null;
        //反转链表
        ListNode2 newHead = resever(mid);
        //组合两个链表
        while (newHead != null){
            ListNode2 temp = newHead.next;
            newHead.next = head.next;
            head.next = newHead;
            head = newHead.next;
            newHead = temp;
        }
    }

    public ListNode2 resever(ListNode2 head){
        if(head== null){
            return head;
        }
        ListNode2 tail = head;
        head = head.next;
        tail.next = null;
        while (head != null){
            ListNode2 tmp =head.next;
            head.next = tail;
            tail = head;
            head = tmp;
        }
        return tail;
    }
}
