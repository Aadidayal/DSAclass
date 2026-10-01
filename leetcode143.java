/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
      public ListNode reverseList(ListNode head) {
            if(head==null){
                return head;
            }
            ListNode prev = null;
            ListNode pres = head;
            ListNode next= pres.next;
            while(pres != null){
                pres.next= prev;
                prev = pres;
                pres = next;
                if(next!=null){
                next= next.next;
                }
            }
            head = prev;
            return prev;
    
        }
  public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
    
            while(fast!=null && fast.next!=null){
                slow= slow.next;
                fast= fast.next.next;
            }
            return slow;
        }

   public void reorderList(ListNode head) {
    if(head == null && head.next == null){
        return ;
    }
    ListNode mid = middleNode(head);
    ListNode start = head ;
    ListNode end = reverseList(mid);

        while (start != null && end != null) {
            ListNode temp = start.next;
            start.next = end ;
            start = temp;
            temp = end.next;
            end.next= start;
            end = temp;
        }
        if(start!=null){
            start.next=null;
        }
}
}