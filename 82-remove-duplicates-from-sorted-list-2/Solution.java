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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while(head != null){
            if(head.next == null || head.val != head.next.val){
                tail.next = head;
                tail = tail.next;
            }
            while(head.next != null && head.val == head.next.val){
                head = head.next;
            }
            head = head.next;
        }

        tail.next = null;
        return dummy.next;

    }
}
