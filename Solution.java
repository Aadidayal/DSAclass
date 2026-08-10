public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode aa = headA;
        ListNode bb = headB;

        while (aa != bb) {

            if (aa == null) {
                aa = headB;
            } else {
                aa = aa.next;
            }

            if (bb == null) {
                bb = headA;
            } else {
                bb = bb.next;
            }
        }

        return aa;
    }
}