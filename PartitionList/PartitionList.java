package leetcode;

public class PartitionList {
	public ListNode partition(ListNode head, int x) {  
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode runner = helper;
        ListNode walker = helper;
        while(runner.next != null){
            if(runner.next.val < x){
                if(runner != walker){
                    ListNode next = runner.next.next;  
                    runner.next.next = walker.next;  
                    walker.next = runner.next;  
                    runner.next = next;
                }else{
                    runner = runner.next;
                }
                walker = walker.next;
            }else{
                runner = runner.next;
            }
        }
        return helper.next;
    }
}
