package leetcode;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        
        ListNode fakehead = new ListNode(-1);
        fakehead.next = head;
        ListNode pre = fakehead;
        ListNode cur = head;
        
        while(cur != null){
            if(cur.val == val){
                pre.next = pre.next.next;
                cur = cur.next;
            }else{
                pre = pre.next;
                cur = cur.next;
            }
        }
        
        return fakehead.next;
    }
}
