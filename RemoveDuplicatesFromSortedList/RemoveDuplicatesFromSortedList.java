package leetcode;

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode pre = head;
        ListNode node = pre.next;
        
        while(node != null){
            if(node.val == pre.val){
                pre.next = node.next;
                node = node.next;
            }else{
                pre = node;
                node = node.next;
            }
        }
        
        return head;
    }
}
