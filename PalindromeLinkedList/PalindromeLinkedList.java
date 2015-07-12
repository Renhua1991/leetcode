package leetcode;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode begin = slow.next;
        slow.next = null;
        
        ListNode newHead = helper(begin);
        
        while(newHead != null){
            if(newHead.val != head.val){
                return false;
            }
            
            newHead = newHead.next;
            head = head.next;
        }
        
        return true;
    }
    
    private ListNode helper(ListNode head){
        ListNode node = head.next;
        ListNode point = head;
        head.next = null;
        
        while(node != null){
            ListNode temp = node.next;
            node.next = point;
            point = node;
            node = temp;
        }
        
        return point;
    }
}
