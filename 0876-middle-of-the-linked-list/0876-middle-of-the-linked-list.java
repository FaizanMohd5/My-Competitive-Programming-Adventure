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
    public ListNode middleNode(ListNode head) {
        
        ListNode normalTurtle = head;
        ListNode rabbitThatCanBeatTurtle = head;
        
        while(rabbitThatCanBeatTurtle != null && rabbitThatCanBeatTurtle.next != null){
            
            normalTurtle = normalTurtle.next;
            rabbitThatCanBeatTurtle = rabbitThatCanBeatTurtle.next.next;
            
        }
        
        return normalTurtle; // In the end still turtle reached goal LoL!
            
    }
}