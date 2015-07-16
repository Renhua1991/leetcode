package leetcode;
import java.util.*;

public class MergeKSortedListsWithPriorityQueue {
	class ListNodeComparator implements Comparator<ListNode>{
        public int compare(ListNode n1, ListNode n2){
            if(n1.val < n2.val){
                return -1;
            }else if(n1.val > n2.val){
                return 1;
            }else{
                return 0;
            }
        }
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new ListNodeComparator());
        ListNode fakehead = new ListNode(-1);
        fakehead.next = null;
        ListNode pre = fakehead;
        
        for(ListNode node : lists){
            if(node != null){
                pq.add(node);
            }
        }
        
        while(pq.size() > 0){
            ListNode tmp = pq.poll();
            
            if(tmp.next != null){
                pq.add(tmp.next);
            }
            
            pre.next = tmp;
            pre = tmp;
        }
        
        pre.next = null;
        
        return fakehead.next;
    }
}
