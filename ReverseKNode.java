/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        ListNode head=A;
        if(head==null) return null;
        int count=0;
        ListNode curr=A;
        ListNode next=null;
        ListNode prev=null;
        while(count<B){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count+=1;
        }
        head.next=reverseList(curr,B);
        return prev;
    }
}
