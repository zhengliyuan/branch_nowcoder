package www.niuke.com.coding;

import www.niuke.com.base.ListNode;
import www.niuke.com.base.ListNode2;

/**
 * @author liyuan zheng
 * @date 2021/3/2 19:39
 * 对于一个给定的链表，返回环的入口节点，如果没有环，返回null。
 * 你能给出不利用额外空间的解法么？
 *
 */
public class NC3 {
    public ListNode2 detectCycle(ListNode2 head) {
        if(head == null){
            return head;
        }
        ListNode2 slow = head;
        ListNode2 fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
