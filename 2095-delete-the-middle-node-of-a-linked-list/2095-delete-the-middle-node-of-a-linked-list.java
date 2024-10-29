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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode turtle = head;
        ListNode rabbit = head;
        ListNode snail = null;
        
        while(rabbit != null && rabbit.next != null){
            snail = turtle;
            turtle = turtle.next;
            rabbit = rabbit.next.next;
        }        
        
        if(snail != null)
            snail.next = turtle.next;
        
        return head;
        
    }
}