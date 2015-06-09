package leetcode;

public class DetectCycle {
	public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode runner = head;
        ListNode walker = head;
        while(runner.next != null && runner.next.next != null){
            walker = walker.next;
            runner = runner.next.next;
            if(walker == runner){
                walker = head;
                while(walker != runner){
                    runner = runner.next;
                    walker = walker.next;
                }
                return runner;
            }
        }
        
        return null;
    }
}
