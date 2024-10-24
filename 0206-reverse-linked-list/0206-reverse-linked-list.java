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
        
        
        if(head == null || head.next == null)
            return head;
        
        ListNode current = head;
        ListNode front = null;
        ListNode back = null;
        
        while(current != null){
            front = current.next;
            current.next = back;
            back = current;
            current = front;
        }
            
        return back;
        
    }
}