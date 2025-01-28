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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head; // Edge cases
        }

        // Calculate the length of the list
        int n = 0;
        ListNode iterator = head;
        while (iterator != null) {
            n++;
            iterator = iterator.next;
        }

        // Optimize the number of rotations
        k = k % n;
        if (k == 0) {
            return head; // No rotation needed
        }

        // Find the (n - k)-th node
        int stepsToNewHead = n - k;
        iterator = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            iterator = iterator.next;
        }

        // Rearrange pointers
        ListNode newHead = iterator.next;
        iterator.next = null;

        // Find the end of the rotated part
        ListNode tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Connect the tail to the original head
        tail.next = head;

        return newHead;
        
    }
}