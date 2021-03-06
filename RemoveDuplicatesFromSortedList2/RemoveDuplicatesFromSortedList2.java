package leetcode;

public class RemoveDuplicatesFromSortedList2 {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(1);
        dummy.next = head;
        ListNode p = dummy;
    
        while(p.next != null && p.next.next != null){
            if(p.next.val != p.next.next.val){
                p = p.next;
            }else{
                while(p.next.next != null && p.next.val == p.next.next.val){
                    p.next.next = p.next.next.next;
                }
                p.next = p.next.next;
            }
        }
    
        return dummy.next;
    }
}
