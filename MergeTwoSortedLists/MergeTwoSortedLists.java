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

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	       //create a new node
	       ListNode fake = new ListNode(0);
	       //in order to get the first node of the new arraylist.
	       ListNode p = fake;
	       
	       while(l1 != null && l2 != null){
	           if(l1.val < l2.val){
	               p.next = l1;
	               l1 = l1.next;
	           }else{
	               p.next = l2;
	               l2 = l2.next;
	           }
	           p = p.next;
	       }
	       
	       if(l1 != null) p.next = l1;
	       if(l2 != null) p.next = l2;
	       
	       return fake.next;
	    }
}
