package leetcode;

import java.util.HashMap;
import java.util.Map;

public class NewIntersectionofTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//		get the length of linkedList A and B. if one is longer than another, trim the longer one 
//		and make sure they are at the same length. Now iterate A and B at the same time to find 
//      the node at which the intersection of two linkedList begins. Time complexity is O(n), space
//      complexity is O(1).
        int lengthA=0;
        int lengthB=0;
        ListNode iterA=headA;
		ListNode iterB=headB;
		while(iterA!=null){
			lengthA++;
			iterA=iterA.next;
		}
		while(iterB!=null){
			lengthB++;
			iterB=iterB.next;
		}
		if(iterA!=iterB) {return null;}
		if(lengthA>lengthB){
			for(int temp=lengthA-lengthB;temp>0;temp--){headA=headA.next;}
		}
		if(lengthB>lengthA){
			for(int temp=lengthB-lengthA;temp>0;temp--){headB=headB.next;}
		}
		while(headA!=headB){
			headA=headA.next;
			headB=headB.next;
		}
		
        return headA;
    }
}
