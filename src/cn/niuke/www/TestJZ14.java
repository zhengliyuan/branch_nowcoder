package cn.niuke.www;

/**
 * @author liyuan zheng
 * @date 2020/10/13 21:25
 */
public class TestJZ14 {
    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        ListNode listNode5=new ListNode(5);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        TestJZ14 testJZ14=new TestJZ14();
        testJZ14.FindKthToTail(listNode1,3);
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||head.next==null){
            return head;
        }
        int flag=1;
        ListNode listNode=head;
        while(flag<=k){
            listNode=listNode.next;
            flag++;
        }
        while(listNode!=null){
            listNode=listNode.next;
            head=head.next;
        }
        ListNode resNode = head;
        return resNode;
    }
}
