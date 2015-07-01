package leetcode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode head1 = l1; 
        ListNode head2 = l2; 
        ListNode head3 = newHead;
        
        int total = 0;
        while(head1 != null || head2 != null){
            if(head1 != null){
                total += head1.val;
                head1 = head1.next;
            }
            if(head2 != null){
                total += head2.val;
                head2 = head2.next;
            }
            head3.next = new ListNode(total % 10);
            head3 = head3.next;
            total /= 10;
        }
        
        if(total == 1){
            head3.next = new ListNode(1);    
        } 
        
        return newHead.next;
    }
}
