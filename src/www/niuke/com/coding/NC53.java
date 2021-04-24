package www.niuke.com.coding;

import www.niuke.com.base.ListNode;

import java.util.Stack;

/**
 * @author liyuan zheng
 * @date 2020/12/1 23:25
 * 给定一个链表，删除链表的倒数第 nn 个节点并返回链表的头指针
 * 例如，
 * 给出的链表为: 1\to 2\to 3\to 4\to 51→2→3→4→5, n= 2n=2.
 * 删除了链表的倒数第 nn 个节点之后,链表变为1\to 2\to 3\to 51→2→3→5.
 *
 * 备注：
 * 题目保证 nn 一定是有效的
 * 请给出请给出时间复杂度为\ O(n) O(n) 的算法
 */
public class NC53 {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if(head == null){
            return head;
        }
        ListNode preNode = head;
        ListNode afNode = head;
        ListNode res = head;
        int flag = 1;
        while (flag < n){
            afNode = afNode.next;
            flag++;
        }
        if(afNode.next == null){
            return head.next;
        }
        //快慢指针同时前进
        while (afNode.next != null){
            res = preNode;
            preNode = preNode.next;
            afNode = afNode.next;
        }
        //找到需要删除的结点前一个，进行删除操作+
        res.next = preNode.next;
        return head;
    }
}
