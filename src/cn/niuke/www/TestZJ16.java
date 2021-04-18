package cn.niuke.www;

/**
 * @author liyuan zheng
 * @date 2020/10/13 20:15
 */
public class TestZJ16 {
    public static void main(String[] args) {
        ListNode list11=new ListNode(1);
        ListNode list12=new ListNode(3);
        ListNode list13=new ListNode(5);
        list11.next=list12;
        list12.next=list13;
        ListNode list21=new ListNode(2);
        ListNode list22=new ListNode(4);
        ListNode list23=new ListNode(5);
        list21.next=list22;
        list22.next=list23;
        TestZJ16 testZJ16=new TestZJ16();
        testZJ16.Merge(list11,list21);
    }
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode result=new ListNode(-1);
        ListNode res=result;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                res.next=list1;
                list1=list1.next;
            }else{
                res.next=list2;
                list2=list2.next;
            }
            res=res.next;
        }
        if(list1 !=null){
            res.next=list1;
        }
        if(list2 !=null){
            res.next=list2;
        }
        return result.next;
    }
}
