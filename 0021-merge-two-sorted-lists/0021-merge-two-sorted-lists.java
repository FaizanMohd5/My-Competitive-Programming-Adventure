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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = null;
        ListNode k = null;
        ListNode i = list1;
        ListNode j = list2;
        while(i!=null && j!=null){
            if(i.val <= j.val){
                if(newList==null){
                    newList = new ListNode(i.val);
                    k = newList;
                }
                else{
                    k.next = new ListNode(i.val);
                    k = k.next;
                }
                i = i.next;
            }
            else{
                if(newList==null){
                    newList = new ListNode(j.val);
                    k = newList;
                }
                else{
                    k.next = new ListNode(j.val);
                    k = k.next;
                }
                j = j.next;
            }
        }
        while (i != null) {
            if (k == null) {
                newList = new ListNode(i.val);
                k = newList;
            } else {
                k.next = new ListNode(i.val);
                k = k.next;
            }
            i = i.next;
        }

        while (j != null) {
            if (k == null) {
                newList = new ListNode(j.val);
                k = newList;
            } else {
                k.next = new ListNode(j.val);
                k = k.next;
            }
            j = j.next;
        }
        return newList;
    }
}