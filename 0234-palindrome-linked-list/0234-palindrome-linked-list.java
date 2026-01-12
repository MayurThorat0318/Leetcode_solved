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
    public boolean isPalindrome(ListNode head) {
        if(head==null && head.next==null)
            return true;

        ListNode one = head;
        ListNode two = head;
        while(one!=null && one.next!=null)
        {
            two=two.next;
            one=one.next.next;
        }
        
        
        ListNode prev = null;
        ListNode curr = two;

        while(curr!=null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode left = head;
        ListNode right = prev;
        while(right!=null)
        {
            if(left.val!=right.val)
                return false;

            left=left.next;
            right=right.next;
        }

        return true;
    }
}