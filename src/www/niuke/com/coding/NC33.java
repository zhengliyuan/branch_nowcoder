package www.niuke.com.coding;

import www.niuke.com.base.ListNode;
import www.niuke.com.base.ListNode33;


/**
 * 将两个有序的链表合并为一个新链表，
 * 要求新的链表是通过拼接两个链表的节点来生成的，且合并后新链表依然有序。
 */
public class NC33 {
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        ListNode headNode = new ListNode(0);
        ListNode newList = headNode;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                newList.next = l2;
                l2 = l2.next;
            }else{
                newList.next = l1;
                l1 = l1.next;
            }
            newList = newList.next;
        }
        newList.next = l1==null? l2:l1;
        return headNode.next;
    }
}
