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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null ;
        }
        ListNode temp=head ;
        ListNode st= head;
        for(int i=0; i<n; i++){
            temp=temp.next;
        }
          if (temp == null) {
            return head.next;
        }
        while(temp.next!=null){
         st=st.next;
         temp=temp.next;   
        }
    st.next = st.next.next;

        return head;
    }
}