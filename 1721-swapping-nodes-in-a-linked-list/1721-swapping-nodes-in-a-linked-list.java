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
    public ListNode swapNodes(ListNode head, int k) {
        int n = 1;
        ListNode iterator1 = head;
        ListNode iterator2 = head;
        while(iterator1.next!=null){
            n++;
            iterator1 = iterator1.next;
        }
        int l = n - k + 1;
        // n is kth node from start
        // l is kth node from end
        iterator1 = head;
        for(int i=1; i <= n; i++){
            if(i < k)
                iterator1 = iterator1.next;
            if(i < l)
                iterator2 = iterator2.next;
        }
        int temp = iterator1.val;
        iterator1.val = iterator2.val;
        iterator2.val = temp;
        return head;
    }
}