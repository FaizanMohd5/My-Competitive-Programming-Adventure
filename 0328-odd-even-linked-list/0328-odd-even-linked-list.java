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
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode even = head;
        ListNode odd = head.next;
        ListNode middle = odd;
        
        while(odd != null && odd.next != null){
            
            even.next = odd.next;
            even = even.next;
            odd.next = even.next;
            odd = odd.next;
            
        }
        
        even.next = middle;
        
        
        return head;
        
    }
}