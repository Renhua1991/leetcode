package leetcode;

import java.util.*;

public class IntersectionofTwoLinkedLists {
	//use HashMap. time complexity is O(n), space complexity is O(n).
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Integer> A = new HashMap<ListNode,Integer>();
        // HashMap<int,ListNode> B = new HashMap<int,ListNode>();
        //put the value and Node pair into hashtable.
        while(headA.next!=null){
            A.put(headA,headA.val);
            headA=headA.next;
        }
        // while(headB.next!=null){
        //     B.put(headB.val,headB);
        //     headB=headB.next;
        // }
        while(headB.next!=null){
            if(A.containsKey(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}
