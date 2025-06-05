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
    public ListNode removeElements(ListNode head, int val) {
        /*
              |       
            7 7 7 7
        | 
            |

         */
        
        while(head != null && head.val == val){
            head = head.next;
        }

        ListNode prev = null;
        ListNode needle = head;

        while(needle != null){
            
            if(needle.val == val){
                prev.next  = needle.next;
            }
            else {
                prev = needle;
            }
            needle = needle.next;

        }

        return head;

    }
}
