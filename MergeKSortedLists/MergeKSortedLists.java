package leetcode;

public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        
        return helper(lists, 0, lists.length - 1);
    }
    
    private ListNode helper(ListNode[] lists, int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            ListNode left = helper(lists, low, mid);
            ListNode right = helper(lists, mid + 1, high);
            return mergeTwoLists(left, right);
        }
        
        return lists[low];
    }
    
    
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode fake = new ListNode(0);
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
