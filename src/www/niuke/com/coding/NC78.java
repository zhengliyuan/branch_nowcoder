package www.niuke.com.coding;

import www.niuke.com.base.ListNode;

/**
 * @author liyuan zheng
 * @date 2020/11/30 23:09
 * 反转链表
 */
public class NC78 {
    public ListNode ReverseList(ListNode head) {
        ListNode list = null;
        ListNode currentNode = head;
        while (currentNode!=null){
            ListNode tempNode = currentNode.next;
            currentNode.next = list;
            list = currentNode;
            currentNode = tempNode;
        }
        return list;
    }
}
