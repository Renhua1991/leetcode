package leetcode;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        
        ListNode fast = head; 
        ListNode slow = head;
        ListNode countlen = head;
        ListNode newhead = new ListNode(-1);
        int len = 0;
        
        while(countlen != null){
            len++;
            countlen = countlen.next;
        }
        
        int n = k % len;
        if(n == 0){
            return head;
        }
        
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        newhead = slow.next;
        fast.next = head;
        slow.next = null;
        
        return newhead;
    }
}
