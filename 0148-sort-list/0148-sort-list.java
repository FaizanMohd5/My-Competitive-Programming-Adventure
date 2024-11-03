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
    
    public ListNode merge(ListNode left, ListNode right){
        
        ListNode l = left;
        ListNode r = right;
        
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        
        while(l != null && r != null){
            
            if(l.val <= r.val){
                temp.next = l;
                l = l.next;
            }
            else{
                temp.next = r;
                r = r.next;
            }
            
            temp = temp.next;
            
        }
        
        if(l != null){
            temp.next = l;
        }
        else{
            temp.next = r;
        }
        
        return dummyNode.next;
        
    }
    
    public ListNode sortList(ListNode head) {
        
        // If no nodes or one node is only present then it's alrady sorted.
        
        if(head == null || head.next == null){
            return head;
        }
        
        // Find middle node
        
        ListNode middle = findMiddle(head);
        
        // Split the linked list at mid.
        
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;
        
        // Sort both the halves 
        
        left = sortList(left);
        right = sortList(right);
        
        // Merge both the halves
        
        return merge(left, right);
        
    }
    
    public ListNode findMiddle(ListNode head){
        
        if(head == null || head.next == null){
            return head;
        }
        
        // rabbit-turtle method
        
        ListNode slow = head;
        
        ListNode fast = head.next; // we'll start from nedxt node because when there are two nodes in list
                    // we cannot split them and recursion doesn't stop
        
        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
        
    }
    
}