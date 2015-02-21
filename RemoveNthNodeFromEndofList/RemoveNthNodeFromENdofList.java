package leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class RemoveNthNodeFromENdofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;
        
        //move p2 to the (n+1)th node
        for(int i = 0; i <n; i++){
            p2 = p2.next;
        }
        
        //if n equals the length of the arraylist, it should return 
        if(p2 == null){
            head = head.next;
            return head;
        }
        
        //move p2 to the last node
        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        
        p1.next = p1.next.next;
       
        return head;
    }
}
