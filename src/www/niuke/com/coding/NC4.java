package www.niuke.com.coding;

import www.niuke.com.base.ListNode;

/**
 * @author liyuan zheng
 * @date 2020/12/13 17:34
 * 判断链表中是否有循环
 */
public class NC4 {
    public boolean hasCycle(ListNode head) {
        boolean resBool = false;
        if(head == null || head.next == null){
            return resBool;
        }
        ListNode low = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast =fast.next.next;
            low = low.next;
            if(fast == low){
                resBool = true;
                return resBool;
            }
        }
        return resBool;
    }
}
