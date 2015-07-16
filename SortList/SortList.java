package leetcode;

public class SortList {
	public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode runner = head;
        ListNode walker = head;
        ListNode firsthalf = head;
        
        while(runner.next != null && runner.next.next != null){
            walker = walker.next;
            runner = runner.next.next;
        }
        
        ListNode secondhalf = walker.next;
        walker.next = null;
        
        ListNode left = null;
        ListNode right = null;
        if(firsthalf != secondhalf){
            left = sortList(firsthalf);
            right = sortList(secondhalf);
        }
        
        return mergeSort(left, right);
    }
    
    private ListNode mergeSort(ListNode left, ListNode right){
        if(left == null){
            return right;
        }
        
        if(right == null){
            return left;
        }
        
        ListNode fake = new ListNode(-1);
        ListNode ptr = fake;
        
        while(left != null && right != null){
            if(left.val < right.val){
                ptr.next = left;
                ptr = ptr.next;
                left = left.next;
            }else{
                ptr.next = right;
                ptr = ptr.next;
                right = right.next;
            }
        }
        
        if(left != null){
            ptr.next = left;
        }
        
        if(right != null){
            ptr.next = right;
        }
        
        return fake.next;
    }
}
