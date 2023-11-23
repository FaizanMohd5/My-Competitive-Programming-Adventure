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
        if(head!=null){
            if(head.next==null)
                return head;
            else{
                ListNode i = head;
                ListNode j = head;
                ListNode tail = head;
                while(j.next!=null){
                    j = j.next;
                    tail = tail.next;
                }
                j.next = head;
                do{
                    i.val = i.val^j.val;
                    j.val = i.val^j.val;
                    i.val = i.val^j.val;
                    ListNode temp = j;
                    i = i.next;
                    while(j.next!=temp)
                        j = j.next;
                } while(i!=j && j.next!=i);
                tail.next = null;
            }
        }
        return head;
    }
}