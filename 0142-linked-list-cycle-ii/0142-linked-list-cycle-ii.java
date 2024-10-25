/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode rabbit = head;
        ListNode turtle = head; 
        
        while(rabbit != null && rabbit.next != null){
            
            turtle = turtle.next;
            rabbit = rabbit.next.next;
            
            if(rabbit == turtle){
                break;
            }
            
        }
        
        if(rabbit == null || rabbit.next == null) return null;
        
        turtle = head;
        
        while(turtle != rabbit){
            turtle = turtle.next; 
            rabbit = rabbit.next;
        }
        
        
        return turtle;
        
    }
}