/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == headB) return headA;
        
        if(headA == null || headB == null){
            return null;
        }

        ListNode temp = headA;

        int m = 1;
        while(temp != null){
            m++;
            temp = temp.next;
        }

        temp = headB;

        int n = 1;
        while(temp != null){
            n++;
            temp = temp.next;
        }

        if(m > n){
            return getIntersectionNode(headB, headA);
        }

        HashSet<ListNode> nodes = new HashSet<>();

        ListNode t1 = headA;
        ListNode t2 = headB;

        while(t1 != null){
            nodes.add(t1);
            t1 = t1.next;
            if(nodes.contains(t2)){
                return t2;
            }
            t2 = t2.next;
        }

        while(t2 != null){
            if(nodes.contains(t2)){
                return t2;
            }
            t2 = t2.next;
        }

        return null;
    }
}

/*
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == headB) return headA;
        
        if(headA == null || headB == null){
            return null;
        }

        ListNode temp = headA;

        int m = 1;
        while(temp != null){
            temp = temp.next;
            m++;
        }
        temp = headB;
        int n = 1;
        while(temp != null){
            temp = temp.next;
            n++;
        }

        

        if(m > n){
            ListNode t1 = headA;
            ListNode t2 = headB;
            while(m != n){
                t1 = t1.next;
                m--;
            }
            while(t1 != null && t1 != t2){
                t1 = t1.next;
                t2 = t2.next;
                if(t1 == t2){
                    return t1;
                }
            }
            if(t1 == null) return null;
        }
        else{
            ListNode t1 = headA;
            ListNode t2 = headB;
            while(m != n){
                t2 = t2.next;
                n--;
            }
            while(t2 != null && t1 != t2){
                t1 = t1.next;
                t2 = t2.next;
                if(t1 == t2){
                    return t1;
                }
            }
            if(t2 == null) return null; else return t1;
        }
        return null;
    }
 */

 /*
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == headB) return headA;
        
        if(headA == null || headB == null){
            return null;
        }

        ListNode temp = headA;

        int m = 1;
        while(temp != null){
            m++;
            temp = temp.next;
        }

        temp = headB;

        int n = 1;
        while(temp != null){
            n++;
            temp = temp.next;
        }

        if(m > n){
            return getIntersectionNode(headB, headA);
        }

        HashSet<ListNode> nodes = new HashSet<>();

        ListNode t1 = headA;
        ListNode t2 = headB;

        while(t1 != null){
            nodes.add(t1);
            t1 = t1.next;
            if(nodes.contains(t2)){
                return t2;
            }
            t2 = t2.next;
        }

        while(t2 != null){
            if(nodes.contains(t2)){
                return t2;
            }
            t2 = t2.next;
        }

        return null;
    }
 
  */
